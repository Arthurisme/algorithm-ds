package leetcode;


/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:

        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].*/

import java.util.HashMap;
import java.util.Map;

public class TwoSumB {
    public int[] calculateTwoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        int[] returnedArray = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put( nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            System.out.println(map.containsValue(complement));
            System.out.println(map.get(i));


            if(map.containsKey(complement) && (map.get(complement)!= i   )){

                return new int[]{i,map.get(complement)};

            }

        }



        throw new IllegalArgumentException("Errors");


    }


    public static void main(String[] args) {

        System.out.println("hello world");

        int[] numbers = {2, 7, 11, 15};

        TwoSumB twoSum = new TwoSumB();
        int[] returnIntArray = twoSum.calculateTwoSum(numbers, 9);
        System.out.println(returnIntArray[0]);
        System.out.println(returnIntArray[1]);


    }

}
