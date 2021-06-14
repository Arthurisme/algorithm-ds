package com.algoexpert.selectionSort;

class SelectionSortProgram1 {


    public static int[] selectionSort(int[] array) {
        // Write your code here.

    if(array.length== 0) {
        return  new int[] {};
    }

        int[] arraySorted = new int[array.length];
        int[] arrayWaitToSorted = new int[array.length];



        for (int i = 0; i < array.length-1 ; i++) {

            int swapMinIndex = i;


            for (int j = i+1; j < array.length ; j++) {


                if (array[j] < array[swapMinIndex] ) {
                    swapMinIndex = j;
                }

            }

            int temp = array[swapMinIndex];
            array[swapMinIndex] = array[i];
            array[i] = temp;



//            int temp = array[swapMinIndex];
//            arraySorted[i] =  array[swapMinIndex];
//            array[swapMinIndex]= array[i];
        }




//        return arraySorted;
        return array;
    }


    public static void main(String arg[]) {


        int[] intArray = new int[]{8, 5, 2, 9, 5, 6, 3};

        int[] resuleArray = selectionSort(intArray);


        for (int i = 0; i < resuleArray.length; i++) {
            System.out.println(resuleArray[i]);

        }


//        System.out.println(bubbleSort(intArray));




   





    }

}
