package com.algoexpert.insertionSort;

class InsertionSortProgram2 {


    public static int[] insertionSort(int[] array) {
        // Write your code here.

    if(array.length== 0) {
        return  new int[] {};
    }



           for (int i = 1; i < array.length; i++) {

               int j = i-1;

               while (j>=0 && array[j]>array[j+1]){
                   int swapInt = array[j];
                   array[j]= array[j+1];
                   array[j+1]=swapInt;


                   j -= 1;

               }

      }

        return array;
    }


    public static void main(String arg[]) {


        int[] intArray = new int[]{8, 5, 2, 9, 5, 6, 3};

        int[] resuleArray = insertionSort(intArray);


        for (int i = 0; i < resuleArray.length; i++) {
            System.out.println(resuleArray[i]);

        }


//        System.out.println(bubbleSort(intArray));




   





    }

}
