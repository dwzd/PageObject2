package com.ddd.listener;

import org.testng.*;

public class CustomerListener3 implements ISuiteListener {


    /**
     * This method is invoked before the SuiteRunner starts.
     *
     * @param suite
     */
    public void onStart(ISuite suite) {
        //当suite标签开始执行时
        System.out.println("onStart: suite 开始执行之前");
    }

    /**
     * This method is invoked after the SuiteRunner has run all
     * the test suites.
     *
     * @param suite
     */
    public void onFinish(ISuite suite) {
        //当suite标签执行完后
        System.out.println("onFinish: suite 开始执行之后");
    }
}
