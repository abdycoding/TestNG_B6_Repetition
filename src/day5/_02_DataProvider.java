package day5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider {

    @Test(dataProvider = "datalarim")
    public  void  UserNameTest(String username){
        System.out.println(username);
    }
    @DataProvider
    Object[] datalarim(){
        Object[] userlar={"Leo", "Cris", "Didier", "Lucas"};
        return userlar;
    }

    @Test(dataProvider = "datalarim2")
    public  void  UserIdler(int userId){
        System.out.println(userId);
    }
    @DataProvider
    Object[] datalarim2(){
        Object[] userIdler ={7, 10, 13, 24};
        return userIdler;
    }
}
