package leetcode;


/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:

        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].*/

import java.lang.reflect.Array;

public class TwoSum {
    public int[] calculateTwoSum(int[] nums, int target) {


        int[] returnedArray = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1 + i; j < nums.length; j++) {

                if ((nums[i] + nums[j]) == target) {
                    System.out.println(nums[j]);

                    return new int[]{i, j};

                }


            }


        }

        throw new IllegalArgumentException("Errors");


    }


    public static void main(String[] args) {

        System.out.println("hello world");

        int[] numbers = {2, 7, 11, 15};

        TwoSum twoSum = new TwoSum();
        int[] returnIntArray = twoSum.calculateTwoSum(numbers, 9);
        System.out.println(returnIntArray[0]);
        System.out.println(returnIntArray[1]);


    }

}
