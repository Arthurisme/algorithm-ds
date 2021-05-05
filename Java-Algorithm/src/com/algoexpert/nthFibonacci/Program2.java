package com.algoexpert.nthFibonacci;

import java.util.ArrayList;

class Program2 {
    public int result;

    public int getNthFib(int n) {
        // Write your code here.

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(1);





            for(int i = 2; i<n; i++){

                ints.add(ints.get(i-1)+ints.get(i-2));


             }







        return ints.get(n-1);
    }


    public static void main(String arg []) {

        Program2 program = new Program2();

        System.out.println(program.getNthFib(4));

    }
}
