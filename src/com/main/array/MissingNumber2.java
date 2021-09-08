package com.main.array;

public class MissingNumber2 {


    public static void main(String[] args) {

        int[] arr = {1, 2, 4,5,7};
        int n = arr.length;
        int missingNumber = getMissingNumber(arr, n);
        System.out.println("::::::::::::"+missingNumber);

    }

    private static int getMissingNumber(int[] arr, int n) {

        int n_element_sum = n * (n+1) / 2;

        int sum = 0;

        for (int i =0; i < n - 1; i ++){

            sum += arr[i];

        }

        return  n_element_sum - sum ;

    }
}
