import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;



public class  HelloSeleniumTest {
    @Test
    public void firstTest()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to the url
        driver.get("https://www.saucedemo.com/");
        //kill the browser
        WebElement element;
        //ID
        element = driver.findElement(By.id("user-name"));

        //Name
        //driver.findElement(By.name("name of locator"));
        //Class Name
        driver.findElement(By.className("form_input"));

        //tag name
        driver.findElement(By.tagName("input"));

        driver.quit();

    }
}
