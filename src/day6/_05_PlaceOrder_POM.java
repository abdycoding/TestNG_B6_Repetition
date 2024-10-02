package day6;

import Utility.Basedriver;
import Utility.tools;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_PlaceOrder_POM extends Basedriver {

    @Test
    public  void  ProceedToCheckout(){
        driver.manage().window().maximize();
        _05_Placeorder_Elements elements=new _05_Placeorder_Elements();

        elements.searchInput.sendKeys("ipod"+ Keys.ENTER);


        elements.addToCArt.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.shoppingCart)).click();
        elements.checkOut.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue3)).click();

        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue4)).click();
        elements.confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.screenshot.getText(), "Your order has been placed!", "The messages are not mathced");

    }


}
