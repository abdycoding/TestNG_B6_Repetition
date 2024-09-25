package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class _04_Enable {
    @Test
    public void Test1(){
        System.out.println("Test 1 is done");
        driver.get("https://www.facebook.com/");
    }

    @Test (enabled = false) // şimdilik çalışma
    public void Test2(){
        System.out.println("Test 2 is done");
    }

    @Test
    public void Test3(){

        System.out.println("Test 3 is done");
        driver.get("https://www.google.com/");
    }

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
