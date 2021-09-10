package com.main.number;

public class ReverseNumber {
    public static void main(String[] args) {

        int x = 987610432;

        System.out.println("---------------"+reverseInteger(x));




        //reverseNumberUsingRemainder(number, reverse);
    }

    private static int reverseInteger(int x) {

        boolean negative = false;

        if (x < 0){
            negative = true;
            x *= -1;
        }
        long reversed = 0;
        while (x > 0){
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }
        if (reversed > Integer.MAX_VALUE){
            return 0;
        }

        return  negative ?(int)(-1 * reversed):(int)reversed;
    }

    private static void reverseNumberUsingRemainder(int number, int reverse) {
        int temp = number;
        while (number !=0){


            int remainder  = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;

           // System.out.println("::::::::::::"+number);
        }
        if(temp == reverse)
            System.out.println("Palindrome Number:");
        else
            System.out.println("Not Palindrome");

        //System.out.println("::::::::::::"+reverse);
    }
}
// rem = x % 10;
// reverse = reverse*10 + rem;
//x = x/10;