package day7;

import Utility.BaseDriverGeneral;
import Utility.tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class llolo extends BaseDriverGeneral {
    @Test
    public void Test_09() {
        driver.get("https://demo.openmrs.org/");
        driver.manage().window().maximize();

        WebDriver driver1=new ChromeDriver();
        tc1 tc = new tc1();

        tc.username.sendKeys("Admin");
        tc.password.sendKeys("Admin123");
        tc.inpatient_Ward.click();
        tc.login_Button.click();

        Actions aksiyon=new Actions(driver);

        aksiyon.moveToElement(driver.findElement(By.xpath("//i[@class='icon-caret-down appui-icon-caret-down link']"))).build().perform();
        tools.bekle(2);


    }
}
