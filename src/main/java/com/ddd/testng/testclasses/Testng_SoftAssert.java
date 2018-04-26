package com.ddd.testng.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng_SoftAssert {
    @Test
    public void testSum(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("\n测试方法->测试两个数相加");
        ClassToBeTested tested = new ClassToBeTested();
        int result = tested.addNum(3, 5);
        Assert.assertEquals(result, 8);

        softAssert.assertEquals(result, 7);
        System.out.println("这两结果不相等");
        softAssert.assertEquals(result, 8);
        System.out.println("相加结果相等！");

        //assertAll 会执行失败和成功的所有的 assert 用例
        softAssert.assertAll();
    }



}
