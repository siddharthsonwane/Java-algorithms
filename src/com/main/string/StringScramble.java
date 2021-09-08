package com.main.string;

import java.util.Random;

public class StringScramble {

    public static void main(String[] args) {


        // Create a random object
        Random r = new Random();

        String word = "coder";

        System.out.println("Before: " + word );
        word = scramble( r, word );

        String s2 = "ocder";
        System.out.println("After : " + word );

    }

    private static String scramble(Random random, String inputString) {
        // Convert your string into a simple char array:
        char a[] = inputString.toCharArray();

        // Scramble the letters using the standard Fisher-Yates shuffle,
        for( int i=0 ; i<a.length ; i++ )
        {
            int j = random.nextInt(a.length);
            // Swap letters
            char temp = a[i]; a[i] = a[j];  a[j] = temp;
        }

        return new String( a );


    }

}
