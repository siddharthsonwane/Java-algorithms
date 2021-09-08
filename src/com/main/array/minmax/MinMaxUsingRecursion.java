package com.main.array.minmax;

import java.util.Map;

public class MinMaxUsingRecursion {

    public static void main(String[] args) {
        int arr[] = { 12, 1234, 45, 67, 1 };
        int n = arr.length;
        System.out.print("Minimum element of array: " +
                getMin(arr, 0, n) + "\n");
        System.out.println("Maximum element of array: " +
                getMax(arr, 0, n));
    }

    private static int getMax(int[] arr, int i, int n) {

        return (n ==1) ? arr[i] : Math.max(arr[i],getMax(arr, i +1, n - 1));
    }

    private static int getMin(int[] arr, int i, int n) {

        return (n ==1) ?arr[i] : Math.min(arr[i], getMin(arr,i + 1, n - 1));
    }
}
