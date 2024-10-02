package day7;

import Utility.Basedriver;
import Utility.tools;
import day6._05_Placeorder_Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class task2 extends Basedriver {
    /*
    Senaryo ;
    1- Siteye gidiniz..

   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */
    @Test
    @Parameters("productName")
    public void Test(String value) {
        driver.manage().window().maximize();
        _05_Placeorder_Elements elements = new _05_Placeorder_Elements();
        _01_Elements sre = new _01_Elements();

        elements.searchInput.sendKeys(value + Keys.ENTER);

        int randomChoice = tools.getRandomIndex(sre.ProductListAddWish.size());
        System.out.println(randomChoice);

        //before clicking it let's get the name of the product
        String clickedproductsname = sre.productListCaption.get(randomChoice).getText();
        sre.ProductListAddWish.get(randomChoice).click(); // clicked to add Cart

        elements.wishlist.click();
        boolean productFound = false;
        for (WebElement productNames : sre.productListBasket) {

            if (productNames.getText().equals(clickedproductsname)) {
                productFound = true;
                break;
            }
        }
        Assert.assertTrue(productFound, "THe product has not been found");}}
