package day7;

import Utility.Basedriver;
import Utility.tools;
import day6._05_Placeorder_Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1 extends Basedriver {
    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan random birini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Seçilen ürünün sepette olduğunu doğrulayınız.
   6- POM ile çözünüz.
 */

    @Test
    public void ProceedToCheckout() {
        driver.manage().window().maximize();
        _05_Placeorder_Elements elements = new _05_Placeorder_Elements();
        _01_Elements sre=new _01_Elements();

        elements.searchInput.sendKeys("ipod" + Keys.ENTER);

        int randomChoice=tools.getRandomIndex(sre.ProductListAddCart.size());
        System.out.println(randomChoice);

        //before clicking it let's get the name of the product
        String clickedproductsname= sre.productListCaption.get(randomChoice).getText();
        sre.ProductListAddCart.get(randomChoice).click(); // clicked to add Cart

        elements.shoppingCart.click();
        boolean productFound=false;
        for (WebElement productNames: sre.productListBasket) {

        if (productNames.getText().equals(clickedproductsname)){
            productFound=true;
            break;}
        }
        Assert.assertTrue(productFound,"THe product has not been found");




           }
       }


