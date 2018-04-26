package com.ddd.testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_Asserts {
    @Test
    public void testAdd(){
        System.out.println("测试两个数的相加结果正确与否!");
        ClassToBeTested tested = new ClassToBeTested();
        int result = tested.addNum(10, 8);
        Assert.assertEquals(result, 18);
    }

    @Test
    public void testStrings(){
        System.out.println("对比测试连接后的字符串");
        ClassToBeTested tested = new ClassToBeTested();
        String expectedSring = "Auto Testing!";
        String result = tested.addStrings("Auto", "Testing!");
        Assert.assertEquals(result, expectedSring);
    }

    @Test
    public void testArray(){
        System.out.println("测试两数组是否相等：");
        ClassToBeTested tested = new ClassToBeTested();
        int[] expectedArray = {1,2,3};
        int[] result = tested.getArray();
        Assert.assertEquals(result, expectedArray);
    }
}
