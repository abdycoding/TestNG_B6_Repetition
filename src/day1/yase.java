package day1;

import Utility.Basedriver;

import Utility.tools;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class yase {


    @Test
    public void Test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://shopdemo.fatfreeshop.com/?");

        tools.bekle(2);

        WebElement demoBook = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        demoBook.click();

        tools.bekle(3);
        driver.switchTo().frame(driver.findElement(By.className("EJIframeV3")));
        WebElement assertBook = driver.findElement(By.xpath("//h5[text()='Demo eBook']"));

        Assert.assertTrue("Can't find in the cart", assertBook.getText().equals("Demo eBook"));


    }
}

