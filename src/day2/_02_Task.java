package day2;

import Utility.Basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class _02_Task extends Basedriver {

    /*
         Senaryo;
         1- Siteyi açınız.
         2- Adress Ekleyiniz.
         3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
         4- En sondan 2. adresi siliniz.
   */
    By adres = By.xpath("(//*[text()='Address Book'])[1]");
    By newAdress = By.xpath("//*[text()='New Address']");
    By fname = By.xpath("//input[@placeholder='First Name']");
    By sname = By.xpath("//input[@placeholder='Last Name']");
    By company = By.xpath("//input[@placeholder='Company']");
    By adress1 = By.xpath("//input[@placeholder='Address 1']");
    By adress2 = By.xpath("//input[@placeholder='Address 2']");
    By city=By.xpath("//input[@placeholder='City']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By country = By.xpath("//select[@id='input-country']");
    By state = By.xpath("//select[@id='input-zone']");
    By ct = By.xpath("//input[@value='Continue']");

    @Test
    public void adresEkle() {
        WebElement adres1 = driver.findElement(adres);
        adres1.click();
        WebElement yeniadres = driver.findElement(newAdress);
        yeniadres.click();
        WebElement isim = driver.findElement(fname);
        isim.sendKeys("Cristiano");
        WebElement soyisim = driver.findElement(sname);
        soyisim.sendKeys("Ronaldo");
        WebElement sirket = driver.findElement(company);
        sirket.sendKeys("Realmadrid");
        WebElement sokak = driver.findElement(adress1);
        sokak.sendKeys("Madrid, Street 4");
        WebElement sokak2 = driver.findElement(adress2);
        sokak2.sendKeys("Spain");
        WebElement sehir=driver.findElement(city);
        sehir.sendKeys("Madrid");
        WebElement posta = driver.findElement(postCode);
        posta.sendKeys("552200");
        WebElement ulke = driver.findElement(country);
        Select sec = new Select(ulke);
        sec.selectByVisibleText("Spain");
        WebElement ulke2 = driver.findElement(state);
        Select sec2 = new Select(ulke2);
        sec2.selectByVisibleText("Madrid");
        WebElement devam = driver.findElement(ct);
        devam.click();
    }

    @Test(dependsOnMethods = {"adresEkle"})
    public void adresEdit() {

        List<WebElement> EditAll=driver.findElements(By.linkText("Edit"));
        WebElement edit=EditAll.get(EditAll.size()-1);
     //   WebElement edit= driver.findElement(By.xpath("(//a[text()='Edit'])[2]"));
        edit.click();


        WebElement isim = driver.findElement(fname);
        isim.clear();
        isim.sendKeys("Leo");
        WebElement soyisim = driver.findElement(sname);
        soyisim.clear();
        soyisim.sendKeys("Messi");
        WebElement ulke = driver.findElement(country);
        Select sec = new Select(ulke);
        sec.selectByVisibleText("Spain");
        WebElement ulke2 = driver.findElement(state);
        Select sec2 = new Select(ulke2);
        sec2.selectByVisibleText("Madrid");
        WebElement devam = driver.findElement(ct);
        devam.click();
    }

    @Test(dependsOnMethods = {"adresEkle","adresEdit"}, alwaysRun = true)
    public void adresSil() {

        List<WebElement> DeleteAll =driver.findElements(By.linkText("Delete"));
        WebElement sil= DeleteAll.get(DeleteAll.size()-1);
//        WebElement sil= driver.findElement(By.xpath("(//a[text()='Delete'])[2]"));
        sil.click();

        WebElement success= driver.findElement(By.xpath("//*[text()=' Your address has been successfully deleted']"));
        Assert.assertTrue(success.getText().contains("successfully"), "error");

    }
}

