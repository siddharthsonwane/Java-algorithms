package com.main.array.reverse;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }

    private static void reverse(int[] arr, int length) {

        int[] b = new int[length];
        int j = length;

        for (int i = 0; i < length; i ++){

            b[j - 1] = arr[i];

            j = j - 1;

        }

        System.out.println("Reverse array is: \n");
        for (int k = 0; k < length; k ++){

            System.out.println(""+b[k]);
        }


    }

}
