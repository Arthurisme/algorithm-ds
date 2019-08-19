
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        For example, two is written as II in Roman numeral, just two one's added together.
        Twelve is written as, XII, which is simply X + II.
        The number twenty seven is written as XXVII, which is XX + V + II.

        Roman numerals are usually written largest to smallest from left to right.
        However, the numeral for four is not IIII. Instead, the number four is written as IV.
        Because the one is before the five we subtract it making four.
        The same principle applies to the number nine, which is written as IX.
        There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
        Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
*/


package leetcode;

public class RomanToIntegerB {
    public int romanToInt(String s){

        int result = 0;
        int buf = 0;
        int bufOld  = 0;



        for(int i =(s.length()-1); i >= 0; i--){


            switch (s.charAt(i)){
                case 'I': {buf = 1; break;}
                case 'V': {buf = 5; break;}
                case 'X': {buf = 10; break;}
                case 'L': {buf = 50; break;}
                case 'C': {buf = 100; break;}
                case 'D': {buf = 500; break;}
                case 'M': {buf = 1000;break;}

            }




            if ((i-1)>= -1){
                System.out.println("i: "+ i);
                System.out.println("buf: "+ buf);
                System.out.println("bufOld: "+ bufOld);

                if (buf >= bufOld){
                    result = result + buf;
                }else {
                    result = result - buf;

                }
                bufOld = buf;
            }else {
                result += buf;
            }
        }


return result;
         
    }




    public static void main(String[] args) {

        System.out.println("hello world");


        RomanToIntegerB romanToInteger = new RomanToIntegerB();
        //int returnInt = romanToInteger.romanToInt("MCMXCIV");
        int returnInt = romanToInteger.romanToInt("IV");
            System.out.println(returnInt);
//            System.out.println(returnIntArray[1]);


    }
}