package day5;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _07_task extends Basedriver {

    @Test
    public  void  Test() {


            WebElement brands= driver.findElement(By.linkText("Brands"));
            brands.click();

            WebElement brands2=driver.findElement(By.xpath("//div[@id='content']"));
            List< WebElement> harfler= driver.findElements(By.xpath("//h2"));

            List <WebElement> markalar=brands2.findElements(By.xpath("//div[@class='col-sm-3']"));
            for (WebElement b:harfler){
                String c= b.getText();
                for(WebElement a:markalar){
                    String harf=a.getText().substring(0,1);
                    Assert.assertTrue(c==harf, "Not equal");
                }}


}}
