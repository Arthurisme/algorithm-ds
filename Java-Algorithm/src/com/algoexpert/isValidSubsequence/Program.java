
/*This program is not able pass the algoexpert online test*/

package com.algoexpert.isValidSubsequence;

import java.util.Arrays;
import java.util.List;

class Program {


    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.


        int lastIndexChecked = 0;

        for(int i = 0; i< sequence.size(); i++) {

            // if sequent has duplicated items:
            if ( ( i >0 ) && (sequence.get(i) == sequence.get(i-1) ) )  {

                return false;
            }

            if (array.contains(sequence.get(i))) {


                if (array.indexOf(sequence.get(i)) < lastIndexChecked) {
                    return false;
                }

                lastIndexChecked =  array.indexOf(sequence.get(i));

            } else {
                return false;
            }

        }


        return true;
    }


    public static void main(String arg []) {



        System.out.println(Program.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(5, 1, 1,1)));

    }
}
