package com.ccg.twoNumberSum;

import java.util.HashMap;
import java.util.Map;

class Program2 {


    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.


        Map<Integer,Integer> integerMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++){


                if(integerMap.containsValue(targetSum - array[i])){
                    return new int[]{array[i], targetSum - array[i] };
                }
 else {
                integerMap.put(i,array[i]);
            }


        }


        return new int[0];
    }


    public static void main(String arg []) {

        Program2 program = new Program2();

        int testArray [] ={3,5,-4,8,11,1,-1,6};


        System.out.println(  "Print test." );
        System.out.println(  Program2.twoNumberSum( testArray, 10)[0]);
        System.out.println(  Program2.twoNumberSum( testArray, 10)[1]);


        Map<Integer,Integer> integerMap2 = new HashMap<Integer, Integer>();

        integerMap2.put(3,0);
        integerMap2.put(5,1);
        if(integerMap2.containsKey(3)){
            System.out.println(  "ntegerMap2.containsKey(3)" );

        }



        }
}
