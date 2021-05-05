package com.algoexpert.staticMethod;


public class TestStatic2 {
    public   void change(int num) {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int i1 = 1;


        TestStatic2 testStatic2 = new TestStatic2();

        testStatic2.change(i1);
        System.out.println(i1);
    }
}
