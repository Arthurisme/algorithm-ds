package com.algoexpert.threeLargestNumber;

class Program16 {



    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.

        int [] arrayLargestThree = new int[3];

        arrayLargestThree[0]= Integer.MIN_VALUE;
        arrayLargestThree[1]= Integer.MIN_VALUE;
        arrayLargestThree[2]= Integer.MIN_VALUE;






        for(int elementInt : array){

            updateThe3Int(arrayLargestThree, elementInt);



        }


        return    arrayLargestThree  ;
    }

    public static void updateThe3Int (int [] arrayLargestThree, Integer elementInt) {

        if (   elementInt > arrayLargestThree[2]  ){


            arrayLargestThree[0] =    arrayLargestThree[1];

            arrayLargestThree[1] =    arrayLargestThree[2];

            arrayLargestThree[2] =    elementInt;

        } else if  (   elementInt >    arrayLargestThree[1]
        ){

            arrayLargestThree[0] =    arrayLargestThree[1];


            arrayLargestThree[1] =    elementInt;



        } else if  (   elementInt >   arrayLargestThree[0]){
            arrayLargestThree[0] =   elementInt;
        }

//        return new int[] {   arrayLargestThree[0] ,    arrayLargestThree[0] ,    arrayLargestThree[0] } ;


    }






    public static void main(String arg []) {


       int[] intArray = new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};



        System.out.println(      findThreeLargestNumbers(intArray)[0]);
        System.out.println(      findThreeLargestNumbers(intArray)[1]);
        System.out.println(      findThreeLargestNumbers(intArray)[2]);






    }

}
