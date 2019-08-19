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
    class ReverseInteger {
        public int reverse(int x) {
            int length = String.valueOf(x).length();

            if (x < 0){
                System.out.println("negative");
                 length = String.valueOf(x).length()-1;


            }
            else{
                System.out.println("not negative");
                 length = String.valueOf(x).length();


            }

            System.out.println("The length of the int is: "+ length);

            int calUntil = 0;
            int calUntilRev = 0;
            int currentLetter =0;

            for(int i=1; i<=length; i++){

                currentLetter = ((x-calUntil) / ((int)Math.pow(10, length-i)));
                calUntil += currentLetter * ((int)Math.pow(10, length-i));



                calUntilRev += currentLetter * ((int)Math.pow(10, i-1)) ;
            }

            System.out.println("The reverse of the int is: "+ calUntilRev);


            return calUntilRev;
        }



        public static void main(String[] args) {

            System.out.println("hello world");



            ReverseInteger reverseInteger = new ReverseInteger();
            int returnInt = reverseInteger.reverse(1534236469);
//            System.out.println(returnIntArray[0]);
//            System.out.println(returnIntArray[1]);


        }
    }