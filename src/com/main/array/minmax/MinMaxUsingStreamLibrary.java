package com.main.array.minmax;

import java.util.Arrays;

public class MinMaxUsingStreamLibrary {

    public static void main(String[] args) {
        int arr[] = { 12, 1234, 45, 67, 1 };
        int n = arr.length;
        System.out.print("Minimum element of array: " +
                getMin(arr, n) + "\n");
        System.out.println("Maximum element of array: " +
                getMax(arr, n));
    }

    private static int getMax(int[] arr, int n) {
        return Arrays.stream(arr).max().getAsInt();
    }

    private static int getMin(int[] arr, int n) {

        return Arrays.stream(arr).min().getAsInt();
    }


}
