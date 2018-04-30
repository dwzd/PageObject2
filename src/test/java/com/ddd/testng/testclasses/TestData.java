package com.ddd.testng.testclasses;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "fruits")
    public Object[][] getData(){
        return new Object[][]{
                {"Apple","red"},
                {"WaterMelon","green"},
                {"Orange","yellow"}
        };
    }
}
