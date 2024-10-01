package day5;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_task extends Basedriver {
    /*
    /*
  Senaryo
  1- Siteyi açınız.
  2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.(menuValidation)
  3- Desktops, Laptops & Notebooks, Components, Tablets, Software, Phones & PDAs, Cameras, MP3 Players
 */

// webden menuyu okuyun, ve 3.sıradaki menu ile karşılatırın:


    @Test
    public  void  BrandTest(){

      WebElement brands= driver.findElement(By.linkText("Brands"));
      brands.click();


       List< WebElement> harfler= driver.findElements(By.xpath(""));




    }

    }
