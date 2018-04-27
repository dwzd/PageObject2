package com.ddd.testng.testclasses;

import com.ddd.base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_TestClass2 extends BaseTestSuite {
    @BeforeClass

    public void setUp() {

        System.out.println("\nTestNG_TestClass2 -> BeforeClass->在类里所有方法运行之前跑");
    }


    @AfterClass

    public void cleanUp() {

        System.out.println("\nTestNG_TestClass2 -> AfterClass->在类里所有方法运行之后跑");
    }


    @BeforeMethod

    public void beforeMethod() {

        System.out.println("\nTestNG_TestClass2 -> beforeMethod->每个测试方法运行完之前跑");
    }


    @AfterMethod

    public void afterMethod() {

        System.out.println("\nTestNG_TestClass2 -> afterMethod->每个测试方法运行完之后跑");
    }


    @Test

    public void testMethod1() {

        System.out.println("\n TestNG_TestClass2 -> testMethod1 -> 第一个测试方法运行");
    }


    @Test

    public void testMethod2() {

        System.out.println("\n TestNG_TestClass2 -> testMethod2-> 第二个测试方法运行");

    }
}
