package DataProviderWithExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage
{
    //ul a[href='https://demo.opencart.com/index.php?route=account/register&language=en-gb']
    //div.mb-3 input[id='input-email']
    WebDriver driver = DriverManager.getdriver();
     public Finally nextOne() throws InterruptedException
     {
         By account=By.cssSelector("div.dropdown i[class='fas fa-user']");
         WebElement accountbtn=driver.findElement(account);
         accountbtn.click();
         Thread.sleep(10000);
         By loginClick=By.cssSelector("li a[class='dropdown-item'][href='https://demo.opencart.com/index.php?route=account/login&language=en-gb']");
         WebElement loginBtn=driver.findElement(loginClick);
         loginBtn.click();
         System.out.println(driver.getCurrentUrl());
         Thread.sleep(10000);


         By user=By.cssSelector("div.mb-3 input[id='input-email']");
         By pass=By.cssSelector("div.mb-3 input[id='input-password']");
         By sub=By.cssSelector("div.mb-3 button[class='btn btn-primary']");

         WebElement username_text=driver.findElement(user);
         username_text.sendKeys("qwerty1");
         WebElement password_text=driver.findElement(pass);
         password_text.sendKeys("123452");
         WebElement LOGIN_button=driver.findElement(sub);
         LOGIN_button.click();
        return new Finally();
     }


}
