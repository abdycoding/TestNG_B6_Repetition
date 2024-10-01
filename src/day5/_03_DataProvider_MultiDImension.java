package day5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_MultiDImension {

    @Test(dataProvider = "UserData")
    public void userNamePasswordTest(String userName, String password){
        System.out.println(userName+ " " + password);

    }

    @DataProvider
    Object[][] UserData (){
            Object[][] userPass={
                    {"Leo", "23secrets"},
                    {"Cris", "00000"},
                    {"Myth", "Mithradnri"},
                    {"Lucas", "12345"},
                    {"Steven", "Student1234"},


            };
        return userPass;
    }
}
