package day1;

import org.testng.annotations.Test;

public class _01_Ordering_Siralama {

    @Test (priority=1) // öncelik ayarı yapılmazsa alfabetik çalışıyor
    public void DriverStartEdildi(){
        System.out.println("Driver Started");
    }

    @Test (priority = 2)
    public void OpentheWebPage(){
        System.out.println("Web Page opened");
    }

    @Test
    public void LoginTestiniYap(){
        System.out.println("Login Test is done");
    }

    @Test
    public void SepetTestiniYap(){
        System.out.println("Sepet Test done");
    }
}
