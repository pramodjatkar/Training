import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class flipkart {
    private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() throws InterruptedException {
        //setup chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        testUrl = "https://www.flipkart.com/";

        // Create a new instance of the Chrome driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.


        //maximize window
        driver.manage().window().maximize();

        // And now use this to visit myBlog
        // Alternatively the same thing can be done like this
        // driver.navigate().to(testUrl);
        driver.get(testUrl);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7619663345");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("bannanje123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();

    }

    @Test
    public  void  testExample() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.className("_3704LK")).sendKeys("mobile");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[3]")).click();


        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(2000);
        try
        {
            driver.navigate();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[5]/div/div/a")).click();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("._2KpZ6l")).click();

//        driver.findElement(By.xpath("#container > div > div._1eztQ7 > div > div > div:nth-child(2) > div > div > div > div > div > label > div._2jIO64 > div > form > div > div:nth-child(2) > div:nth-child(1) > input")).sendKeys("Pramod");
//
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[2]/div[2]/input")).sendKeys("7619663345");
//
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[3]/div[1]/input")).sendKeys("586102");
//
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[3]/div[2]/input")).sendKeys("Vijayapur");
//
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[4]/div/div[1]/textarea")).sendKeys("near rto, Vijayapur");
//
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[5]/div[1]/div[1]/input")).sendKeys("Vijayapur");
//
//        Select dropState = new Select(driver.findElement(By.name("state")));
//        dropState.selectByVisibleText("Karnataka");
//
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[6]/div[1]/input")).sendKeys("near Rto");

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[1]/button")).click();


    }


}
