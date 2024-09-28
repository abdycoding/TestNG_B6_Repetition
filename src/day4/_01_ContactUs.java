package day4;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUs extends Basedriver {
    @Test
    public void ContactUs(){

        /*
        <!--XML ile çalıştırdığı testlere parametre gönderebilir  -->
        <!--XML de "Classes" öncesi parameter name="mesaj" value="Merhaba testing dünyası"></parameter> olarak tanımladık-->
        <!--01_ContactUsParametre classı ta public void içine String parametre alacağını tanımladık -->
        <!--01_ContactUsParametre de @Parameters("mesaj") xmldeki parametrenin name veriyoruz.Bu şekilde -->
        <!--hangi parametre nereye gideceğini belirtmiş oluyoruz-->
        <!--Artık Testteki methoda XML den parametre gönderebiliyoruz -->
         */
        WebElement contactUsBtn= driver.findElement(By.linkText("Contact Us"));
        contactUsBtn.click();
        WebElement enquiryArea= driver.findElement( By.id("input-enquiry"));
        enquiryArea.sendKeys("Hello Testing World");

        WebElement submit= driver.findElement(By.cssSelector("[type='submit']"));
        new Actions(driver)
                .scrollToElement(submit)
                .click()
                .build().perform();


        Assert.assertTrue(driver.getCurrentUrl().contains("success"), "Error");

    }
}
