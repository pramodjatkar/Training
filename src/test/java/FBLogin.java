import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FBLogin {
    static WebDriver driver;
    @Test
    public void EdurekaProfile() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//Launch the Edureka Website
        driver.get("https://www.edureka.co/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("si_popup_email")));
        Thread.sleep(2000);
        actions.click();
        actions.sendKeys("djpramod725@gmail.com");
        Thread.sleep(2000);
        actions.build().perform();
        actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
        Thread.sleep(2000);
        actions.click();
        actions.sendKeys("Testing123");
        Thread.sleep(2000);
        actions.build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")));
        Thread.sleep(2000);
        actions.click();
        actions.build().perform();
        driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[4]/a")).click();

//        Thread.sleep(2000);
//        WebDriverWait waitElement = new WebDriverWait(driver,20);
//        waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(),'My Profile')]")));
//        driver.findElement(By.xpath("//li[@class='active']//a[@data-toggle='tab'][contains(text(),'My Profile')]")).click();
//        String Pagetitle = driver.getTitle();
//        driver.findElement(By.xpath("//div[@class='personal-details']//i[@class='icon-pr-edit']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Edureka");
//        Thread.sleep(2000);
//        System.out.println("b");driver.navigate().to("https://learning.edureka.co/my-profile");
//        Thread.sleep(2000);
//        System.out.println("a");
//        System.out.println("abc");
//        driver.navigate().to("https://learning.edureka.co/onboarding/careerinterests");
//        Thread.sleep(3000);
//        Select dropdownCurrentJob = new Select(driver.findElement(By.xpath("//select[@name='interestedJob']")));
//        Thread.sleep(2000);
//        dropdownCurrentJob.selectByVisibleText("Software Testing");
//        Thread.sleep(2000);
//        Select dropdownEmployementType = new Select(driver.findElement(By.xpath("//select[@name='elementType']")));
//        Thread.sleep(2000);dropdownEmployementType.selectByVisibleText("Both");
//        Select dropdownCTC = new Select(driver.findElement(By.xpath("//select[@name='lastDrawnSalary']")));
//        Thread.sleep(2000);
//        dropdownCTC.selectByVisibleText("Not applicable");
//        driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.name("preferredCity")).sendKeys("Mumbai");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(2000);
//        driver.navigate().to("https://learning.edureka.co/");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[@class='user_name']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
//        Thread.sleep(2000);
//        System.out.println("a");
//        try {Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}