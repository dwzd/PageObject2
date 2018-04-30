package com.ddd.testng.testclasses;

import org.testng.annotations.Test;

public class TestNG_DataProviders {
    @Test(dataProvider = "fruits", dataProviderClass = TestData.class)
    public void testMethod(String input, String value){
        System.out.println("The input is: "+ input);
        System.out.println("The value is: "+ value);
    }
}
