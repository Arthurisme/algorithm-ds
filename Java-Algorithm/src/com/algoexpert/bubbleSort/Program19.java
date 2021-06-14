package com.algoexpert.bubbleSort;

class Program19 {


    public static int[] bubbleSort(int[] array) {
        // Write your code here.

        boolean isSorted = false;
        int counter = 0;

        while (!isSorted) {
           isSorted = true;

           for (int i = 0; i < array.length-1-counter; i++) {

                if(array[i+1]<array[i]){
                    int swapInt = array[i];
                    array[i]= array[i+1];
                    array[i+1]= swapInt;

                    isSorted = false;
                }

            }

            counter++;

        }

        return array;
    }


    public static void main(String arg[]) {


        int[] intArray = new int[]{8, 5, 2, 9, 5, 6, 3};

        int[] resuleArray = bubbleSort(intArray);


        for (int i = 0; i < resuleArray.length; i++) {
            System.out.println(resuleArray[i]);

        }


//        System.out.println(bubbleSort(intArray));




   





    }

}
