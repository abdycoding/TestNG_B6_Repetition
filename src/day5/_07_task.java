package day5;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _07_task extends Basedriver {

    @Test
    public void Test() {


        WebElement brands = driver.findElement(By.linkText("Brands"));
        brands.click();
        List<WebElement> harfler = driver.findElements(By.xpath("//h2"));
        List<WebElement> markalar = driver.findElements(By.cssSelector("[id='content'] > div"));

        for (int i = 0; i <harfler.size() ; i++) {
        String harf=harfler.get(i).getText();
        WebElement harfinaltindakiSatir=markalar.get(i);

        List<WebElement> brand=harfinaltindakiSatir.findElements(By.tagName("div"));

        for (WebElement marka:brand){
            System.out.println(harf+ " " + marka.getText());
            Assert.assertTrue(harf.charAt(0)== marka.getText().charAt(0), "The title and the first letter of the brand is not equal");
        }
        }



//            WebElement brands= driver.findElement(By.linkText("Brands"));
//            brands.click();
//
//
//            List< WebElement> harfler= driver.findElements(By.xpath("//h2"));
//
//            List <WebElement> markalar=driver.findElements(By.xpath("//div[@id='content']//div[@class='col-sm-3']"));
//            Assert.assertEquals(harfler.get(2).getText(), markalar.get(3).getText().substring(0,1), "Not Equal");
//
//            markalar.remove(3);
//
//            for (WebElement b:harfler){
//                String c= b.getText();
//                for(WebElement a:markalar){
//                    String harf=a.getText().substring(0,1);
//
//                    if (c.equals(harf)) {
//                        Assert.assertTrue(true, "Not equal");
//                    }
//
//
//
//                }}


    }
}
