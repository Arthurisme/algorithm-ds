package com.algoexpert.twoNumberSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Program5 {


    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.


//        Set<Integer> integerSet = new HashSet<Integer>();

        ArrayList <Integer> integerList = new ArrayList<Integer>();




        int index = 0;

        for (int num:array)

            {


            if (integerList.contains(targetSum - num)) {
                return new int[]{num, targetSum - num};
            } else {
                integerList.add(num);
            }



            index++;

        }


        return new int[0];
    }


    public static void main(String arg[]) {

        Program5 program = new Program5();

        int testArray[] = {3, 5, -4, 8, 11, 1, -1, 6};


        System.out.println("Print test.");
        System.out.println(Program5.twoNumberSum(testArray, 10)[0]);
        System.out.println(Program5.twoNumberSum(testArray, 10)[1]);


        Map<Integer, Integer> integerMap2 = new HashMap<Integer, Integer>();

        integerMap2.put(3, 0);
        integerMap2.put(5, 1);
        if (integerMap2.containsKey(3)) {
            System.out.println("ntegerMap2.containsKey(3)");

        }


    }
}
