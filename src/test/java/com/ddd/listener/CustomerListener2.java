package com.ddd.listener;

import org.testng.*;

public class CustomerListener2 implements ITestListener {


    public void onTestStart(ITestResult result) {
        //测试方法开始时才执行
        System.out.println("onTestStart-> test name: "+ result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        //测试方法成功时才执行
        System.out.println("onTestSuccess-> test name: "+ result.getName());
    }

    public void onTestFailure(ITestResult result) {
        //测试方法失败时才执行
        System.out.println("onTestFailure-> test name: "+ result.getName());
    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //忽略
    }

    public void onStart(ITestContext context) {
        //xml 文件中的test 执行时，才开始运行
        System.out.println("onStart-> test tag name: "+ context.getName());
        //返回所有测试方法的名字
        ITestNGMethod methods[] = context.getAllTestMethods();
        System.out.println("test tag 里面要执行的测试方法: ");
        for (ITestNGMethod method:methods){
            System.out.println(method.getMethodName());
        }
    }

    public void onFinish(ITestContext context) {
        //xml 文件中的test 执行时，才开始运行
        System.out.println("onFinish-> test tag name: "+ context.getName());
    }
}
