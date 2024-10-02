package day6;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _03_SoftASsertvsHardAssert {
    @Test
    public void HardAssert(){

        String s1="Merhaba";

        System.out.println("Before ASsert");
        Assert.assertEquals("Hello", s1, "They are not equal");

        System.out.println("After Assert");
    }

    @Test
    public void SoftASsert(){
        String strHomePage="www.facebook.com/homepage";
        String strCardPage="www.facebook.com/cardpage";
        String strEditPage="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage); // hata yok
        System.out.println("ASsert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCardPage, "expected vs actual is not equal"); // hata VAR
        System.out.println("ASsert 2");

        _softAssert.assertEquals("www.facebook.com/settings", strEditPage, "expected vs actual is not equal"); // hata VAR
        System.out.println("ASsert 3");

        // ben hatalari isleme koy deyince, bu noktada haatalari aktif etsin, arada kesilmesin
        _softAssert.assertAll();// softtan harda gecir

        System.out.println("soft AssertAll() sonrasi");

    }

}
