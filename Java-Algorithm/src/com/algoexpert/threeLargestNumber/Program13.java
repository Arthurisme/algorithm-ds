package com.algoexpert.threeLargestNumber;

import java.util.HashMap;
import java.util.Map;

class Program13 {



    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.

        Map<Integer, Integer> arrayMap = new HashMap();
//        arrayMap.put(0,array[0]);
//        arrayMap.put(1,array[1]);
//        arrayMap.put(2,array[2]);






        for(int elementInt : array){

            if ( !arrayMap.containsKey(2) || elementInt > arrayMap.get(2)   ){

                if(arrayMap.containsKey(1) ){
                    arrayMap.put(0,arrayMap.get(1));
                }

                if(arrayMap.containsKey(2) ){
                    arrayMap.put(1,arrayMap.get(2));
                }


                arrayMap.put(2,elementInt);
            } else if  ( !arrayMap.containsKey(1) || elementInt > arrayMap.get(1)  ){

                if(arrayMap.containsKey(1) ) {


                    arrayMap.put(0, arrayMap.get(1));
                }

                arrayMap.put(1,elementInt);


            } else if  ( !arrayMap.containsKey(0) || elementInt > arrayMap.get(0)   ){
                arrayMap.put(0,elementInt);
            }

        }


        return new int[] {arrayMap.get(0), arrayMap.get(1), arrayMap.get(2)} ;
    }






    public static void main(String arg []) {


       int[] intArray = new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};



        System.out.println(      findThreeLargestNumbers(intArray)[0]);
        System.out.println(      findThreeLargestNumbers(intArray)[1]);
        System.out.println(      findThreeLargestNumbers(intArray)[2]);






    }

}
