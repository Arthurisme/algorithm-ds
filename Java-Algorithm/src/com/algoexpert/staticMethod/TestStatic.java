package com.algoexpert.staticMethod;


public class TestStatic {
    public static void change(int num) {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int i1 = 1;
        TestStatic.change(i1);
        System.out.println(i1);
    }
}
