package com.main.array.reverse;

public class ReverseArrayUsingSwaping {

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }

    private static void reverse(int[] arr, int length) {

        int  i ,k, t;
        for (i = 0;i<length/2; i++){
            t = arr[i];
            arr[i] = arr[length -  i - 1];
            arr[length - i -1] = t;
        }
        for (k = 0;k < length; k++){

            System.out.println(""+arr[k]);

        }
    }
}

