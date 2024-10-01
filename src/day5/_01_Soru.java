package day5;



import Utility.BasedriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_Soru extends BasedriverParameter {

/*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun lerde (bütün ürünlerde indirim var mı, eski fiyat yeni fiyat var mı)
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
   5- Yukarıdaki işlemi 2 farklı browserda ve paralel şekilde test ediniz.
   //pazartesi Gun05 alalım ve 01 diyelim
*/
    @Test
    public void Test() {
        WebElement specials = driver.findElement(By.linkText("Specials"));
        specials.click();

        List<WebElement> oldPrices = driver.findElements(By.xpath("//span[@class='price-old']"));
        List<WebElement> newPrices = driver.findElements(By.xpath("//span[@class='price-new']"));

        // Check that each product has a discounted price and that the new price is less than the old price
        for (int i = 0; i < oldPrices.size(); i++) {
            String oldPriceText = oldPrices.get(i).getText().substring(1);
            String newPriceText = newPrices.get(i).getText().substring(1);

            double oldPrice = Double.parseDouble(oldPriceText);
            double newPrice = Double.parseDouble(newPriceText);

            // Assert that the new price is less than the old price
            Assert.assertTrue(newPrice < oldPrice,
                    "New price (" + newPrice + ") is not less than old price (" + oldPrice + ")");
        }
    }
//    @Test
//    public void Test2() {
//       WebElement specials = driver.findElement(By.linkText("Specials"));
//        specials.click();
//
//
//  List<Double> newprices=new ArrayList<>();
//  List<Double> oldprices=new ArrayList<>();
//
//        double number = 0;
//        double number2 = 0;
//        List<WebElement> oldprice = driver.findElements(By.xpath("//span[@class='price-old']"));
//        for (WebElement a:oldprice) {
//            String eskiprice = a.getText().substring(1);
//            number = Double.parseDouble(eskiprice);
//            newprices.add(number);
//
//        }
//
//        List<WebElement> newprice = driver.findElements(By.xpath("//span[@class='price-new']"));
//        for (WebElement e:newprice) {
//            String yenifiyat = e.getText().substring(1);
//            number2 = Double.parseDouble(yenifiyat);
//            oldprices.add(number2);
//
//        }
////        if (number2 < number) {
////            Assert.assertTrue(true, "New price is not greater than old price");
////        }
//
//        for (int i = 0; i < oldprices.size(); i++) {
//            double a=newprices.get( i);
//            double b=oldprices.get(i);
//            Assert.assertTrue(a<b, "New price is not greater than old price");
//
//        }



//    }

}
