package com.algoexpert.threeLargestNumber;

class Program17 {


    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.

        int[] arrayLargestThree = new int[3];

        arrayLargestThree[0] = Integer.MIN_VALUE;
        arrayLargestThree[1] = Integer.MIN_VALUE;
        arrayLargestThree[2] = Integer.MIN_VALUE;


        for (int elementInt : array) {

            updateThe3Int(arrayLargestThree, elementInt);

        }


        return arrayLargestThree;
    }

    public static void updateThe3Int(int[] arrayLargestThree, Integer elementInt) {

        if (elementInt > arrayLargestThree[2]) {
            shiftAndUpdate(arrayLargestThree, elementInt, 2);

        } else if (elementInt > arrayLargestThree[1]
        ) {
            shiftAndUpdate(arrayLargestThree, elementInt, 1);

        } else if (elementInt > arrayLargestThree[0]) {
            shiftAndUpdate(arrayLargestThree, elementInt, 0);

        }

    }


    public static void shiftAndUpdate(int[] arrayLargestThree, Integer elementInt, int idx) {

        for (int i = 0; i <= idx; i++) {

            if (i == idx) {
                arrayLargestThree[i] = elementInt;
            } else {
                arrayLargestThree[i] = arrayLargestThree[i + 1];

            }
        }


    }


    public static void main(String arg[]) {


        int[] intArray = new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};


        System.out.println(findThreeLargestNumbers(intArray)[0]);
        System.out.println(findThreeLargestNumbers(intArray)[1]);
        System.out.println(findThreeLargestNumbers(intArray)[2]);


    }

}
