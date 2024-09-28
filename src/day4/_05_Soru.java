package day4;

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

import Utility.Basedriver;
import Utility.BasedriverParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Soru extends Basedriver {
@Test
    public void Test(){
    WebElement specials=driver.findElement(By.linkText("Specials"));
    specials.click();


//    List<WebElement> oldprice=driver.findElements(By.className("price-old"));
    WebElement oldprice=driver.findElement(By.xpath("(//span[@class='price-old'])[1]"));
//    for (WebElement a: oldprice){
        String eskiprice=oldprice.getText().substring(1,4);
        int number=Integer.parseInt(eskiprice);
//    }

//    List<WebElement> newprice=driver.findElements(By.className("price-new"));
    WebElement newprice=driver.findElement(By.xpath("(//span[@class='price-new'])[1]"));

//    for (WebElement a: oldprice){
        String yenifiyat=newprice.getText().substring(1,3);
        int number2=Integer.parseInt(yenifiyat);
//    }
        if (number2<number){
            Assert.assertTrue(true,"New price is not greater than old price" );
        }



}


}
