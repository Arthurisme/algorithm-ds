package leetcode;


/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

        Example 1:

        Input: 121
        Output: true
        Example 2:

        Input: -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        Follow up:

        Coud you solve it without converting the integer to a string?
        */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int length = String.valueOf(x).length();

        if (x < 0){
            System.out.println("negative");
            length = String.valueOf(x).length()-1;

return false;
        }
        else{
            System.out.println("not negative");
            length = String.valueOf(x).length();


        }

        System.out.println("The length of the int is: "+ length);


        int currentLetter =0;
        int currentLetterOppo =0;

        for(int i=1; i<=length; i++){
            //System.out.println("The x of the int is: "+ x);

//            int testa = 3 % 10;
//            System.out.println("The testa of the int is: "+ testa);


            currentLetter = (x / ((int)Math.pow(10, length-i))) % (10);
            currentLetterOppo = (x % (((int)Math.pow(10, i))))/ ((int)Math.pow(10, i-1)) ;
//            System.out.println("The currentLetter of the int is: "+ currentLetter);
//            System.out.println("The currentLetterOppo of the int is: "+ currentLetterOppo);


            if((currentLetterOppo != currentLetter)){
                return  false;

            }

        }

        System.out.println("(currentLetterOppo == currentLetter) is: "+ (currentLetterOppo == currentLetter));


        return (currentLetterOppo == currentLetter);
    }


    public boolean isPalindrome2(int num){
        if(num < 0) return  false;
        int reversed = 0, remainder, original = num;
        while(num != 0) {
            remainder = num % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            num  /= 10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;
    }

    public static void main(String[] args) {

        System.out.println("hello world");



        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean returnInt = palindromeNumber.isPalindrome(1368228631);
//            System.out.println(returnIntArray[0]);
//            System.out.println(returnIntArray[1]);


    }
}
