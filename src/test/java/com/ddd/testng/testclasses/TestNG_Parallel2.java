package com.ddd.testng.testclasses;

import org.testng.annotations.Test;

public class TestNG_Parallel2 {
    @Test
    public void testMethod3() throws InterruptedException {
        System.out.println("TestNG_Parallel2 -> testMethod5");
        Thread.sleep(5000);
        System.out.println("TestNG_Parallel2 -> testMethod6 -> More Steps");
    }

    @Test
    public void testMethod4() throws InterruptedException {
        System.out.println("TestNG_Parallel2 -> testMethod7");
        Thread.sleep(5000);
        System.out.println("TestNG_Parallel2 -> testMethod8 -> More Steps");
    }
}
