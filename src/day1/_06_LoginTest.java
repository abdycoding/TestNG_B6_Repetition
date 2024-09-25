package day1;

import Utility.Basedriver;
import Utility.tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_LoginTest extends Basedriver {

    //1 - Siteye Login olunuz
    // 2 - Login oldugunuzu Title ile Assert yapiniz

    @Test
    public void Login(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        tools.bekle(2);
        WebElement username= driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']"));
        username.sendKeys("hobbiton986@gmail.com");
        tools.bekle(2);
        WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
      password.sendKeys("Mithrandir10");
        tools.bekle(2);
      WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
      login.click();
        tools.bekle(2);

        wait.until(ExpectedConditions.titleIs("My Account"));
        Assert.assertTrue(driver.getTitle().contains("Account"), "Title de Account kelimesi yok");

    }
}
