package com.main.array.cyclicallyrotate;

import java.util.Arrays;

public class CyclicallyRotateByOne {

    static int arr[] = new int[]{2, 9, 3, 5, 7};

    public static void main(String[] args) {

       /* int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int last, i;
        System.out.print("The original array is: ");
        for (i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        last = arr[n-1];
        for (i = n-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = last;
        System.out.print("\nThe rotated Array is: ");
        for (i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");*/

        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

       // rotate();
        rorate2();

        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));

    }

    private static void rorate2() {

        int i = 0, j = arr.length - 1;
        while (i != j){

            int temp = arr[i];

            arr[i] = arr[j];

            arr[j] = temp;

            i++;

        }

    }

    private static void rotate() {

        /*int x = arr[arr.length-1], i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;*/
    }


}
