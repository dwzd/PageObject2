package com.ddd.testng.testclasses;

import org.testng.annotations.Test;

public class TestNG_Parallel1 {
    @Test
    public void testMethod1() throws InterruptedException {
        System.out.println("TestNG_Parallel1 -> testMethod1");
        Thread.sleep(5000);
        System.out.println("TestNG_Parallel1 -> testMethod2 -> More Steps");
    }

    @Test
    public void testMethod2() throws InterruptedException {
        System.out.println("TestNG_Parallel1 -> testMethod3");
        Thread.sleep(5000);
        System.out.println("TestNG_Parallel1 -> testMethod4 -> More Steps");
    }
}
