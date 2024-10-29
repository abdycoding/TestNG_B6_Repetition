package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Basedriver {
    public static Logger addLog = LogManager.getLogger();//add log and start the process(line)
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri(){
        System.out.println(" Baslangic islemleri yapiliyor");
        driver=new ChromeDriver();
         driver.manage().window().maximize(); // ekrani max yapiyor.
        addLog.info("Driver Started");

        // hata olusmus olsaydi
        addLog.error("Error occurred while creating the driver");


        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));

Login();
    }
    @AfterClass
    public void KapanisIslemleri(){
        System.out.println("Kapanis Islemleri yapiliyor");

        // Tools.Bekle(3);
        driver.quit();
    }

    public void Login(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        tools.bekle(2);
        WebElement username= driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']"));
        username.sendKeys("hobbiton986@gmail.com");
        addLog.info("Right now" + "hobbiton986@gmail.com " + "user name is sent to the base");
        WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Mithrandir10");
        tools.bekle(2);
        WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();
        tools.bekle(2);

        wait.until(ExpectedConditions.titleIs("My Account"));
        addLog.debug("Passing to the Login process");
        Assert.assertTrue(driver.getTitle().contains("Account"), "Title de Account kelimesi yok");

        addLog.debug("Login process is successfully completed");
        addLog.warn("There was a mistake in the username");
    }

    @BeforeMethod
    public void BeforeMethod(){
        addLog.info("Method will start to work");



    }
    @AfterMethod
    public void AfterMethod(ITestResult result){
        addLog.info(result.getName() + " Method has been completed");
        addLog.info(result.getStatus()== 1 ? "Passed" : "Failed");

        //Very important fatal situation is occurred

        addLog.fatal(result.getName() + " Really important Mistake is occurred");
    }
}
