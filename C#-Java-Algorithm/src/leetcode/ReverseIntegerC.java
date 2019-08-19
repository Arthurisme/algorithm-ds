package leetcode;

/*
Given a 32-bit signed integer, reverse digits of an integer.

        Example 1:

        Input: 123
        Output: 321
        Example 2:

        Input: -123
        Output: -321
        Example 3:

        Input: 120
        Output: 21
        Note:
        Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

*/


// integer have a range that if the number are larger than it, the int return function fail.
class ReverseIntegerC {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }

        System.out.println("The reverse of the int is: " + Integer.MAX_VALUE);
        System.out.println("The reverse of the int is: " + rev);

        return rev;
    }


    public static void main(String[] args) {

        System.out.println("hello world");


        ReverseIntegerC reverseInteger = new ReverseIntegerC();
        int returnInt = reverseInteger.reverse(1646324351);
//            System.out.println(returnIntArray[0]);
//            System.out.println(returnIntArray[1]);


    }
}