import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
    public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // Alert Message handling

        driver.get("http://demo.guru99.com/test/delete_customer.php");


        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();

        driver.close();

        String baseUrl = "http://demo.guru99.com/test/newtours/";

        driver.get(baseUrl);
        String innerText = driver.findElement(By
                        .xpath("//table/tbody/tr/td[2]"
                                + "//table/tbody/tr[4]/td/"
                                + "table/tbody/tr/td[2]/"
                                + "table/tbody/tr[2]/td[1]/"
                                + "table[2]/tbody/tr[3]/td[2]/font"))
                .getText();
        System.out.println(innerText);
        driver.quit();
    }
}
