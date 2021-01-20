package com.ccg.nthFibonacci;

class Program4 {

    public static int getNthFib(int n) {
        // Write your code here.

  if(n == 1 ){
      return  0;
  } else if (n == 2 ){
      return  1;
  }


      return getNthFib(n-2) + getNthFib(n-1);



    }


    public static void main(String arg []) {


        System.out.println(Program4.getNthFib(4));

    }
}
