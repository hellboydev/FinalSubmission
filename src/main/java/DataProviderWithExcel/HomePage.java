package DataProviderWithExcel;


import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver = DriverManager.getdriver();

    public HomePage openurl(String url) {
        driver.get(url);
        return this;
    }


    public ItemPage clickOnDesktop() throws InterruptedException {
        By desktopBy= By.cssSelector("li a[class='nav-link dropdown-toggle']");
        WebElement mainMenu = driver.findElement(desktopBy);
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        By pcBy=By.cssSelector("ul li a[href='https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=20_27']");
        WebElement subMenu = driver.findElement(pcBy);
        actions.moveToElement(subMenu);
        actions.click().build().perform();
      //  Thread.sleep(15000);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return new ItemPage();
    }



}
