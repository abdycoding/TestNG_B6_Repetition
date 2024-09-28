package day4;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearchFunctionality extends Basedriver {

    /*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */

    @Test ()
    @Parameters("searchedText")
    public void Max(String message) {
        WebElement mac= driver.findElement(By.xpath("//input[@placeholder='Search']"));
        mac.sendKeys(message+ Keys.ENTER);


        List<WebElement> h4=driver.findElements(By.xpath("//h4/a"));
        for (WebElement s:h4)
            Assert.assertTrue(s.getText().toLowerCase().contains(message), "Error");
    }


}