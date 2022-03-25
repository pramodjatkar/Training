import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        Thread.sleep(10000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("bannanje123");
        Thread.sleep(10000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();

    }

    @Test
    public  void  testExample() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.className("_3704LK")).sendKeys("mi mobile");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")).click();


    }


}
