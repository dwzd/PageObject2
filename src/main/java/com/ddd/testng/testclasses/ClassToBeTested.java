package com.ddd.testng.testclasses;

public class ClassToBeTested {
    public int addNum(int a, int b){
        return a+b;
    }
    public String addStrings(String x, String y) {
        return x + " " + y;
    }

    public int[] getArray() {
        int[] arrayExample = {1, 2, 3};
        return arrayExample;
    }
}
