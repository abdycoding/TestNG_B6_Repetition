package day1;

import Utility.Basedriver;
import org.testng.annotations.Test;

public class _05_BaseDriverTest extends Basedriver {
    @Test
    public void Test1(){
        driver.get("https://www.google.com/");

    }

}
