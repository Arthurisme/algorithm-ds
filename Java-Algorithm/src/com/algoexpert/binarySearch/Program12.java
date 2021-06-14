package com.algoexpert.binarySearch;

class Program12 {



    public static int binarySearch(int[] array, int target) {
        // Write your code here.


    return binarySearchHelper(array,target, 0, array.length-1);
    }


    public static int binarySearchHelper(int[] array, int target, int left, int right) {
        // Write your code here.




        while (left <= right) {
            int middle = (left + right) / 2;

            if (target == array[middle]) {
                return middle;
            } else if (target < array[middle]) {
                right = middle-1;
            } else {
                left = middle+1;
            }

        }

        return -1;


    }









    public static void main(String arg []) {


       int[] intArray = new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};



            System.out.println(      binarySearch(intArray,33));






    }

}
