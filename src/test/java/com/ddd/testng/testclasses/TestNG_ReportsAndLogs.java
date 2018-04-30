package com.ddd.testng.testclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNG_ReportsAndLogs {
    @BeforeClass
    public void setUp(){
        Reporter.log("TestNG_ReportsAndLogs ->在class开始运行之前运行: ", true);
    }

    @AfterClass
    public void cleanUp() {
        Reporter.log("estNG_ReportsAndLogs -> 在class运行之后运行", true);
    }

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("TestNG_ReportsAndLogs -> 每个test方法运行之前运行", true);
    }

    @AfterMethod
    public void afterMethod() {
        Reporter.log("TestNG_ReportsAndLogs -> 每个test方法运行之后运行", true);
    }

    @Test
    public void testMethod1() {
        Reporter.log("TestNG_ReportsAndLogs -> testMethod1", true);
    }

    @Test
    public void testMethod2() {
        Reporter.log("TestNG_ReportsAndLogs -> testMethod2", true);
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods={ "testMethod2" })
    public void testMethod3() {
        Reporter.log("TestNG_ReportsAndLogs -> testMethod3", true);
    }
}
