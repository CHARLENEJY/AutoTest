package Resource;

import Element_Web.Web_Elements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static AppiumDriver<MobileElement> driver;
//    private static WebDriver<WebElement> drivers;

    public boolean is_Web_ElementPresent(WebElement element, int timeout) {
//        ChromeDriver chromeDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e){
            return false;
        }
    }

//    public static void clickElement_Web(WebElement element){
//        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.findElement(By.xpath(element));
//    }


//    public void clickElement_Web (WebElement element){
//
//
//    }





















}
