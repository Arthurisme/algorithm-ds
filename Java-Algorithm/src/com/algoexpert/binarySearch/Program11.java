package com.algoexpert.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program11 {



    public static int binarySearch(int[] array, int target) {
        // Write your code here.


    return binarySearchHelper(array,target, 0, array.length-1);
    }


    public static int binarySearchHelper(int[] array, int target, int left, int right) {
        // Write your code here.

        if(left > right){
            return  -1;
        }

        int middle = (left + right)/2;

        if(target == array[middle]) {
            return middle;
        } else  if(target < array[middle]) {
            return binarySearchHelper(array,target, left, middle -1);
        }else  {
            return binarySearchHelper(array,target, middle + 1, right);
        }




    }



    public static void main(String arg []) {


       int[] intArray = new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};



            System.out.println(      binarySearch(intArray,33));






    }

}
