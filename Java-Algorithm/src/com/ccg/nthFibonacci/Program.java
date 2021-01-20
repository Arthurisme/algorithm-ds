package com.ccg.nthFibonacci;

import java.util.*;

class Program {
    public int result;

    public int getNthFib(int n) {
        // Write your code here.

         int lastFib =1 ;

        int [] lastTwoFib = {0, 1};

        System.out.println(  lastTwoFib[0] );
        System.out.println(  lastTwoFib[1] );


        if (n == 1) {
            this.result = 0 ;
        }else  if (n == 2) {
            this.result = 1 ;
        }else   {
            for(int i = 0; i< n-2; i++){

                int tem =  lastTwoFib[0];
                lastTwoFib[0] =   lastTwoFib[1];
                lastTwoFib[1] =  tem + lastTwoFib[0];


                System.out.println(  lastTwoFib[0] );
                System.out.println(  lastTwoFib[1] );


                this.result = lastTwoFib[1] ;
            }
        }






        return this.result;
    }


    public static void main(String arg []) {

        Program program = new Program();

        System.out.println(program.getNthFib(2));

    }
}
