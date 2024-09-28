package day3;

import Utility.Basedriver;
import Utility.tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class task1 extends Basedriver {
    @Test
    public  void Test(){

        List<WebElement> Edit =driver.findElements(By.linkText("Edit Account"));
        WebElement edit= Edit.get(0);
        edit.click();

        WebElement name=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        name.clear();
        name.sendKeys("Ronaldo");

        WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.clear();
        lastname.sendKeys("Cristiano");

        WebElement ct=driver.findElement(By.xpath("//input[@value='Continue']"));
        ct.click();

        tools.SuccessMessageValidation();
    }
}
