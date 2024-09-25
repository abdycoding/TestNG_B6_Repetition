package day1;

import Utility.Basedriver;
import Utility.tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _08_SubscribeNewsLetter extends Basedriver {
    @Test (priority = 1)
    public void Test(){
        /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.
  3-
  4-
 */
        WebElement newsLetter= driver.findElement(By.xpath("(//*[text()='Newsletter'])[2]"));
        newsLetter.click();

        WebElement yes= driver.findElement(By.xpath("//input[@value='1']"));
        yes.click();


        WebElement continuee= driver.findElement(By.xpath("//input[@value='Continue']"));
        continuee.click();

        tools.SuccessMessageValidation();
    }
    @Test(priority = 2)
    public void Test2(){
        /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.
  3- no halini yapiniz
  4-
 */
        WebElement newsLetter= driver.findElement(By.xpath("(//*[text()='Newsletter'])[2]"));
        newsLetter.click();

        WebElement no= driver.findElement(By.xpath("//input[@value='0']"));
        no.click();


        WebElement continuee= driver.findElement(By.xpath("//input[@value='Continue']"));
        continuee.click();

        tools.SuccessMessageValidation();
    }

    By yes = By.xpath("//input[@value='1']");
    By no = By.xpath("//input[@value='0']");

    @Test (priority = 3)
    public void Test3() {
        /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.
  3- no halini yapiniz
  4-
 */
        WebElement newsLetter = driver.findElement(By.xpath("(//*[text()='Newsletter'])[2]"));
        newsLetter.click();

        WebElement subscribeYes = driver.findElement(yes);
        WebElement subscribeNo = driver.findElement(no);
        if (subscribeYes.isSelected()) {
            subscribeNo.click();
            tools.bekle(2);
        } else {
            subscribeYes.click();
        }
        tools.bekle(3);


        WebElement continuee = driver.findElement(By.xpath("//input[@value='Continue']"));
        continuee.click();
        tools.bekle(3);

        tools.SuccessMessageValidation();
    }


}
