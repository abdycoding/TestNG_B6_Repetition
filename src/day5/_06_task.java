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
    public void menuValidation() {
        //Beklenen Listemiz
        List<String> menuExpectedList = new ArrayList<>();  // String[] menu={"Desktops","",""};
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        //Web deki menu listemiz
        List<WebElement> menuActualList=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));

        for (int i = 0; i < menuExpectedList.size(); i++) {

            Assert.assertEquals(
                    menuActualList.get(i).getText(),
                    menuExpectedList.get(i),
                    "Menu beklendiği gibi değil!");
        }

    }

    }
