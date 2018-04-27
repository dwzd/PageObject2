package com.ddd.base;

import org.testng.annotations.*;

public class BaseTestSuite {
    @BeforeClass

    public void beforeClass() {

        System.out.println("\n BaseTestSuite -> BeforeClass");

    }


    @AfterClass

    public void afterClass() {

        System.out.println("\n BaseTestSuite -> afterClass");

    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("\n BaseTestSuite -> BeforeTest");
    }


    @AfterTest
    public void afterTest() {
        System.out.println("\n BaseTestSuite -> AfterTest");
    }


    @BeforeSuite
    public void beforeSuite() {

        System.out.println("\n BaseTestSuite -> beforeSuite");

    }


    @AfterSuite

    public void afterSuite() {

        System.out.println("\n BaseTestSuite -> afterSuite");

    }
}
