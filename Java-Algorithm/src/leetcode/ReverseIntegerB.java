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
class ReverseIntegerB {
    public int reverse(int x) {
        int length ;

        int inputInt ;

        if (x < 0) {
            System.out.println("negative");
            length = String.valueOf(x).length()-1 ;
            inputInt = x * -1;

        } else {
            System.out.println("not negative");
            length = String.valueOf(x).length();
            inputInt = x ;

        }

        char[] intToArray = String.valueOf(inputInt).toCharArray();
        char intToArrayReverse[] = new char[length] ;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            System.out.println("intToArray: " + intToArray[i]);
            intToArrayReverse[i] = intToArray [length-i-1];
            stringBuilder.append(intToArrayReverse[i]);
        }

        if (x < 0) {

        }


        System.out.println("The length of the int is: " + length);
        System.out.println("stringBuilder.toString() is: " + stringBuilder.toString());


        int calUntilRevProCal = Integer.parseInt(stringBuilder.toString()) ;

        int calUntilRev;
        if (x < 0) {
            calUntilRev = -1 * calUntilRevProCal;
        } else  {
            calUntilRev = calUntilRevProCal;

        }



        System.out.println("The reverse of the int is: " + calUntilRev);


        return calUntilRev;
    }


    public static void main(String[] args) {

        System.out.println("hello world");


        ReverseIntegerB reverseInteger = new ReverseIntegerB();
        //int returnInt = reverseInteger.reverse(123);
        int returnInt = reverseInteger.reverse(646324351);
//            System.out.println(returnIntArray[0]);
//            System.out.println(returnIntArray[1]);


    }
}