package com.algoexpert.bubbleSort;

class Program18 {


    public static int[] bubbleSort(int[] array) {
        // Write your code here.


        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {

                if(array[j]<array[i]){
                    int swapInt = array[i];
                    array[i]= array[j];
                    array[j]= swapInt;
                }
            }

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
