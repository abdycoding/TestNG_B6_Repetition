package day1;

import Utility.Basedriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _07_Assertions extends Basedriver {
    @Test
    public  void  EqualsOrnek(){
            String s1="Hello";
            String s2="Hello";
            // actual(olusan), Expected(beklenen),  mesaj(opsiyonel)
        Assert.assertEquals(s1,s2,"olusanla beklenen ayni degil");
    }

    @Test
    public  void  NotEqualsOrnek(){
        String s1="Hello";
        String s2="Hello";
        // actual(olusan), Expected(beklenen),  mesaj(opsiyonel)
        Assert.assertNotEquals(s1,s2,"olusanla beklenen ayni degil");
    }

    @Test
    public  void  TrueOrnek(){
        String s1="Hello";
        String s2="Hello";
        // actual(olusan), Expected(beklenen),  mesaj(opsiyonel)
        Assert.assertTrue(s1.equals(s2),"olusanla beklenen ayni degil");
    }

    @Test
    public void NullOrnek(){
        String s=null;
        Assert.assertNull(s, "Deger null degil");
    }
    @Test
    public void direktFail() {
        int a=56;
        if (a!=56){
            Assert.fail();
        }
    }

    @Test
    public void FalseOrnek(){
        int s1=4;
        int s2=7;

        Assert.assertFalse(s1==s2, "olusanla beklenen ayni degil");
    }

}
