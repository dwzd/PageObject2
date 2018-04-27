package com.ddd.testng.testclasses;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Testng_ClassAnnotationTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("before method 1");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("after method 2");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("before class!");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("after class!");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

}