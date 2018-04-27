package com.ddd.testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_DependentTests {
    ClassToBeTested tested;

    @BeforeClass
    public void setUp() {
        System.out.println("before class");
        tested = new ClassToBeTested();
    }

    @AfterClass
    public void clearUp() {
        System.out.println("after class");
    }

    //希望测试顺序为 2 1 3 4
    @Test(dependsOnMethods = {"testMethod2"}, alwaysRun = true)
    public void testMethod1() {
        System.out.println("testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("testMethod2");
        int result = tested.addNum(3, 5);
        Assert.assertEquals(result, 9);
    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3() {
        System.out.println("testMethod3");
    }

    @Test(dependsOnMethods = {"testMethod3"})
    public void testMethod4() {
        System.out.println("testMethod4");
    }

    //不让 5 运行
    @Test(enabled = false)
    public void testMethod5() {
        System.out.println("testMethod5");
    }

    @Test(timeOut = 1)
    public void testMethod6() throws InterruptedException {
        System.out.println("testMethod6");
        Thread.sleep(2);
    }
}
