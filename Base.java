import cucumber.api.java.zh_cn.假如;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.*;
import org.slf4j.*;
import Element_Web.Web_Elements;
import Resource.BasePage;
import io.appium.java_client.pagefactory.*;

public class Base {
    private BasePage basePage = new BasePage();
//    protected static WebDriver<WebElement> driver = DriverCon


    @WindowsFindAll({@WindowsBy(xpath = Web_Elements.ACCNOUT_TIANMAO)})
    private WebElement Account_TianMao;

    public void clickElement_Web (WebElement element){

    }

    @Test
    public void main() throws Exception{
        WebDriverManager.edgedriver().setup();
        WebDriverManager.chromedriver().setup();
//     如果需要用Edge就打开它：
//     EdgeDriver edgeDriver = new EdgeDriver();

//     如果需要用Chrome就打开它：
        ChromeDriver chromeDriver = new ChromeDriver();

//     edgeDriver.get("https://detail.tmall.com/item.htm?id=663318311770&spm=a1z0k.7386009.0.d4919233.457b37deCquS8C&_u=t2dmg8j26111&sku_properties=20549:103189693");
//     String title = edgeDriver.getTitle();
//     System.out.print("title:"+title);

        chromeDriver.get("https://detail.tmall.com/item.htm?id=663318311770&spm=a1z0k.7386009.0.d4919233.457b37deCquS8C&_u=t2dmg8j26111&sku_properties=20549:103189693");
        String title = chromeDriver.getTitle();
        System.out.print("title:"+title);
        chromeDriver.findElement(By.xpath(Web_Elements.ACCNOUT_TIANMAO)).click();
        chromeDriver.findElement(By.xpath(Web_Elements.ACCNOUT_TIANMAO)).sendKeys("Gingersaber@gmail.com");
        Thread.sleep(3000);
        chromeDriver.findElement(By.xpath(Web_Elements.PASSWORD_TIANMAO)).click();
        chromeDriver.findElement(By.xpath(Web_Elements.PASSWORD_TIANMAO)).sendKeys("Jiangyue123");
        Thread.sleep(3000);
        chromeDriver.findElement(By.xpath(Web_Elements.LOGIN_BUTTON_TIANMAO)).click();
    }

}
