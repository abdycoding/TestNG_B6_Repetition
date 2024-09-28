package day4;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUsParameter extends Basedriver {

    @Test
    @Parameters("message")
    public void ContactUs( String gelenMesaj){
        WebElement contactUsBtn= driver.findElement(By.linkText("Contact Us"));
        contactUsBtn.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement enquiryArea= driver.findElement( By.id("input-enquiry"));
        enquiryArea.sendKeys(gelenMesaj);

        WebElement submit= driver.findElement(By.cssSelector("[type='submit']"));
        js.executeScript("arguments[0].scrollIntoView();", submit);
        submit.click();


        Assert.assertTrue(driver.getCurrentUrl().contains("success"), "Error");

    }
}
