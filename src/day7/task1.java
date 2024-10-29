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
    public void addToCart()
    {
        Basedriver.addLog.info("addToCart testi başladı");
        _05_Placeorder_Elements poe=new _05_Placeorder_Elements();
        _01_Elements sre= new _01_Elements();

        poe.searchInput.sendKeys("ipod"+ Keys.ENTER);

        int randomSecim= tools.getRandomIndex(sre.productListAddCart.size()); // 0,1,2,3
        System.out.println(randomSecim);

        //tıkaltmadan önce ürürnün ismini saklayalım
        String tiklatilacakUrununAdi=sre.productListCaption.get(randomSecim).getText();
        sre.productListAddCart.get(randomSecim).click(); // Add chart a tıklandı

        poe.shoppingCart.click();

//        boolean urunBulundu=false;
//        for(WebElement urun : sre.productListBasket)
//        {
//            if (urun.getText().equals(tiklatilacakUrununAdi)) {
//                urunBulundu = true;
//                break;
//            }
//        }

        boolean urunBulundu=tools.listContainsString(sre.productListBasket, tiklatilacakUrununAdi); // yukarıdaki döngü metod yapıldı
        Assert.assertTrue(urunBulundu,"Eklediğiniz sepette bulunamadı");


    }}
