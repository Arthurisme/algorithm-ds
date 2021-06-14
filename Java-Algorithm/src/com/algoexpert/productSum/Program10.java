package com.algoexpert.productSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program10 {

    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.

    public static int productSum(List<Object> array) {
        // Write your code here.



        return productSumHelp(array, 1);
    }


    public static int productSumHelp(List<Object> array, int level) {
        // Write your code here.

        int sum = 0;

        for(Object el:array){
            System.out.println(el);
            if(el instanceof ArrayList){
//                ArrayList<Object> ls =  (ArrayList<Object>)el;

                List<Object> ls =  Arrays.asList(((ArrayList<?>) el).toArray());

                sum += productSumHelp(ls,level+1);

            } else {
                sum +=(int)el;
//                System.out.println(Integer.parseInt(obj.toString()));

            }

        }

        return sum*level;
    }


    public static void main(String arg []) {

        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));



            System.out.println(      productSum(test));






    }

}
