package com.ccg.nthFibonacci;

import java.util.ArrayList;

class Program3 {

    public static int getNthFib(int n) {
        // Write your code here.

  if(n == 1 ){
      return  0;
  } else if (n == 2 ){
      return  1;
  } else {
      return getNthFib(n-2) + getNthFib(n-1);
  }



    }


    public static void main(String arg []) {


        System.out.println(Program3.getNthFib(4));

    }
}
