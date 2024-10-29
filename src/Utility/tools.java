package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class tools {
    public static void bekle(int sn) {
        try {
            Thread.sleep(sn* 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
}
    public static void SuccessMessageValidation(){
        WebElement success= Basedriver.driver.findElement(By.xpath("//*[text()=' Success: Your newsletter subscription has been successfully updated!']"));

        Assert.assertTrue(success.getText().toLowerCase().contains("success"), "Error 404");

    }
    public static int getRandomIndex(int num) {
        return (int) (Math.random() * num);
    }

    public static boolean listContainsString(List<WebElement> list, String searchedWord ){
        boolean productFound =false;
        for(WebElement urun : list)
        {
            if (urun.getText().equals(searchedWord)) {
                productFound = true;
                break;
            }
        }
        return productFound;
    }

}
