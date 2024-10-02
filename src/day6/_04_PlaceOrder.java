package day6;

import Utility.Basedriver;
import Utility.tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _04_PlaceOrder extends Basedriver {

    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/
    @Test
    public void Test() {
        driver.manage().window().maximize();
        WebElement ipod= driver.findElement(By.xpath("//input[@placeholder='Search']"));
        ipod.sendKeys("ipod"+ Keys.ENTER);

        WebElement ipod2= driver.findElement(By.xpath("(//div[@class='button-group']/button)[1]"));
        ipod2.click();
        tools.bekle(1);
        WebElement sepet=driver.findElement(By.xpath("(//button[@data-toggle])[2]"));
        sepet.click();
        tools.bekle(2);
        WebElement watch=driver.findElement(By.xpath("//strong[text()=' View Cart']"));
        watch.click();
        tools.bekle(1);

        WebElement checkout= driver.findElement(By.xpath("//div[@class='pull-right']"));
        checkout.click();


        WebElement continue1=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue1.click();

        WebElement continue2=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continue2.click();
        WebElement continue3=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continue3.click();

        WebElement agree=driver.findElement(By.name("agree"));
        agree.click();

        WebElement continue4=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        continue4.click();

        WebElement confirm=driver.findElement(By.id("button-confirm"));
        confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));
        WebElement screenshot= driver.findElement(By.xpath("//div[@id='content']/h1"));
        Assert.assertEquals(screenshot.getText(),"Your order has been placed!", "The message is not equal");



    }
}
