package day5;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_task extends Basedriver {
/**
 * Daha önceki derslerde yaptğımız Search fonksiyonunu
 * mac,ipod ve samsung için Dataprovider ile yapınız.
 * BaseDriver
 */
@Test(dataProvider = "brands")
public  void  BrandTest(String products){
    WebElement search= driver.findElement(By.xpath("//input[@placeholder='Search']"));
    search.clear();
    search.sendKeys(products+ Keys.ENTER);



    List<WebElement> h4=driver.findElements(By.xpath("//h4/a"));
    for (WebElement s:h4)
        Assert.assertTrue(s.getText().toLowerCase().contains(products), "Error");

}
    @DataProvider
    Object[] brands(){
        Object[] markalar ={"mac", "samsung", "ipod"};
        return markalar;
    }

}
