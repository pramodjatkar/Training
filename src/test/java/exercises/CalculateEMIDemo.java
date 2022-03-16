
package  exercises;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculateEMIDemo{

    @Test
    public void calculateLoanEMI() throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to the url
        driver.get("http://a.testaddressbook.com/");

        driver.findElement(By.id("sign-in")).click();

        Thread.sleep(5000);

        driver.findElement(By.id("session_email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("selenium");
        driver.findElement(By.name("commit")).click();



        driver.findElement(By.cssSelector("a[data-test-'addresses']")).click();



        driver.findElement(By.cssSelector("a[data-test-'create']")).click();


        driver.findElement(By.id("address_first_name")).sendKeys("FirstName");
        driver.findElement(By.id("address_last_name")).sendKeys("LastName");
        driver.findElement(By.id("address_street_address")).sendKeys("Address1");
        driver.findElement(By.id("address_city")).sendKeys("City");
        driver.findElement(By.id("address_zip_code")).sendKeys("12345");

        String colorToSelect = "#0433ff";
        driver.findElement(By.id("address_color")).sendKeys(colorToSelect);
        driver.findElement(By.name("commit")).click();

    }

}
