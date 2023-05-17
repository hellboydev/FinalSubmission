package DataProviderWithExcel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class ItemPage
{
    WebDriver driver = DriverManager.getdriver();
    public loginPage nextpage() throws InterruptedException {
           // driver.findElement(By.linkText("iMac")).click();
    	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          //div.content a[href='https://demo.opencart.com/index.php?route=product/product&language=en-gb&path=20_27&product_id=41']
    	//div.image a img[title='iMac']
    	//
    By desktopBy1=By.cssSelector("div.image a[href='https://demo.opencart.com/index.php?route=product/product&language=en-gb&path=20_27&product_id=41']");
    //	WebElement alert= driver.findElement(By.cssSelector("div.button-group button[aria-label=\"Add to Cart\"]"));   
      WebElement element = driver.findElement(desktopBy1);
            JavascriptExecutor js = (JavascriptExecutor) driver;
           // JS to scroll into view
           js.executeScript("arguments[0].scrollIntoView();", element);
           element.click();
            Thread.sleep(10000);
            return new loginPage();

        }

}
