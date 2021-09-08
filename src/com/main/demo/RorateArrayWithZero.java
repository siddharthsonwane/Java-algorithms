package com.main.demo;

import java.util.Arrays;

public class RorateArrayWithZero {

    public static void main(String[] args) {

        int arr[] ={2,4,6,1,0,4,0,3,0};
              //// {2,4,6,1,4,3,0,0,0}

         rotateArray(arr);
         displayArrayOut(arr);

    }

    private static void displayArrayOut(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            System.out.println("::::"+arr[i]);
        }

    }

    private static void rotateArray(int[] arr) {

        int n = arr.length;


        for (int i = 0; i < n - 1; i ++){

            for(int j = i + 1; j< n; j ++){

                if (arr[i] ==0){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
            }
        }




       /* for (int  i = 0; i<n -1; i ++){

            if (arr[i] == 0){

                int zerosPos = arr[]

                arr[i]

            }

        }*/


    }


}
