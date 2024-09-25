package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_Annotations {
    @Test
    public void Test1(){
        System.out.println("Test 1 is done");
    }
    @Test
    public void Test2(){
        System.out.println("Test 2 is done");
    }
    @BeforeClass // class ın içindekiler çalışmadan önce çalışır
    public void BeforeClassPart(){
        System.out.println("Before Class part is working");
    }
    @AfterClass // Class ın içindekiler çalıştıktan sonra çalışır
    public void AfterClassPart(){
        System.out.println("After Class part is working");
    }
}
