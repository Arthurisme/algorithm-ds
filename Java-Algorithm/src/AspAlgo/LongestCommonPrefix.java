package AspAlgo;

/*
Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

        Example 1:

        Input: ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
        Note:

        All given inputs are in lowercase letters a-z.
        */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        return "ok";
    }

    public static void main(String[] args){

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] strArrayForTest = {"flower","flow","flight"};
        String strLongestCommonPrefix = longestCommonPrefix.longestCommonPrefix(strArrayForTest);

        System.out.println(strLongestCommonPrefix);
    }
}
