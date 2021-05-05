
/*This program is not able pass the algoexpert online test*/

package com.algoexpert.isValidSubsequence;

import java.util.Arrays;
import java.util.List;

class Program2 {


    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.





         int sequenceMoveIndex = 0;


        for(int arrayItem: array){
            if (arrayItem==(sequence.get(sequenceMoveIndex))) {

                sequenceMoveIndex++;

                if (sequenceMoveIndex == sequence.size()){
                    return true ;
                }
            }
        }



        return sequenceMoveIndex == sequence.size();

    }


    public static void main(String arg []) {



        System.out.println(Program2.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(5, 1, 6,8)));

    }
}
