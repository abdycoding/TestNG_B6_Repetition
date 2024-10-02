package day5;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _08_task  {
    @Test
    public void Test(){

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.ebay.com/n/all-brands");

        List<WebElement> harfler= driver.findElements(By.xpath("//div[@class='section']/h2"));
        harfler.remove(0);

        List<WebElement>markalar=driver.findElements(By.xpath("//div[@class='section']//ul"));
        markalar.removeFirst();
        for (int i = 0; i < 27; i++) {
            String letter=harfler.get(i).getText();
            WebElement brandsofTheLetters= markalar.get(i);

            List<WebElement> brand=brandsofTheLetters.findElements(By.tagName("ul"));

        for (WebElement c:brand){
            Assert.assertTrue(letter.charAt(0) == c.getText().charAt(0), "Error");

        }
    }}
}
