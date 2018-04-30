package com.ddd.listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomerListener1 implements IInvokedMethodListener {

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("before Invocation: "+ testResult.getTestClass().getName()+"-->"+
        method.getTestMethod().getMethodName());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("after Invocation: "+ testResult.getTestClass().getName()+"-->"+
                method.getTestMethod().getMethodName());
    }
}
