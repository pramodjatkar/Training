import SauceItem.SauceItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This class represents page object
public class InventiryPage {

    private  final WebDriver driver;

    public  InventiryPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //storing sauce back pack in in a method
    private WebElement sauceLabsBackpack()
    {
        return new ChromeDriver().findElement(By.className(""));
    }

    public void  addTpCart(SauceItem item)
    {
        //logic to add the appropriate item to the cart
        //new ChromeDriver().findElement(item).click();
    }
}
