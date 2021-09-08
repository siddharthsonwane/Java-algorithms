package com.main.array;


import java.util.Arrays;

//How to find the missing number in integer array of 1 to 100
public class MissingNumber {

    public static void main(String[] args) {
/*

        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n",
                Arrays.toString(iArray), missing);
*/

        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

        System.out.println("The missing number is " + getMissingNumber(arr));



    }

    private static String getMissingNumber(int[] arr) {


        int n = arr.length;

        
       return null;

    }

    private static int getMissingNumber(int[] numbers, int totalCount) {

        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers)
         {
             actualSum += i;
         }
         return expectedSum - actualSum;
    }

}
