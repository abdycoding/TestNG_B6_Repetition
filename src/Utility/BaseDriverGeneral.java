package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriverGeneral {

        public static WebDriver driver;
        public static WebDriverWait wait;

        @BeforeClass
        public void BaslangicIslemleri(){
            System.out.println(" Baslangic islemleri yapiliyor");
            driver=new ChromeDriver();
            // driver.manage().window().maximize(); // ekrani max yapiyor.

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühleti
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
            wait=new WebDriverWait(driver, Duration.ofSeconds(20));


        }
        @AfterClass
        public void KapanisIslemleri(){
            System.out.println("Kapanis Islemleri yapiliyor");

            // Tools.Bekle(3);
            driver.quit();
        }


    }

