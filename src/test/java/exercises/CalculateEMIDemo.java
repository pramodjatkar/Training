package  exercises;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalculateEMIDemo{

    @Test
    public void calculateLoanEMI() throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to the url
        driver.get("https://emicalculator.net/");

        Actions actions = new Actions(driver);

        WebElement loanSliderCirlce = driver.findElement(By.cssSelector("#loanamountslider >span"));
        WebElement interestSliderCirlce = driver.findElement(By.cssSelector("#loaninterestslider >span"));
        WebElement tenureSliderCircle = driver.findElement(By.cssSelector("#loantermslider >span"));

        actions.dragAndDrop(loanSliderCirlce).build.perform();
    }

}
