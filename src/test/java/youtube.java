import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class youtube {
    private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() throws InterruptedException {
        //setup chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().window().maximize();

        // And now use this to visit myBlog
        // Alternatively the same thing can be done like this
        // driver.navigate().to(testUrl);



    }

    @Test
    public  void  testExample() throws InterruptedException {

        testUrl = "https://www.youtube.com/";
        driver.get(testUrl);
        Thread.sleep(2000);

        driver.findElement(By.name("search_query")).sendKeys("kannada songs");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[7]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"guide-icon\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[1]/a/tp-yt-paper-item")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[2]/a/tp-yt-paper-item/yt-formatted-string")).click();

        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[4]/a/tp-yt-paper-item/yt-formatted-string")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[2]/a/tp-yt-paper-item")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"destination-content-root\"]")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[3]/div[2]/ytd-topbar-menu-button-renderer[1]/div/a/yt-icon-button/button/yt-icon")).click();


        Thread.sleep(6000);


        driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown[2]/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer/a/tp-yt-paper-item")).click();

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
        driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/ul/li[1]/a/figure/img[1]")).click();

    }

}
