package com.main.interview;

public class SeparateZeroOne {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 1};

        getSeparatedZeroOne(arr);

    }

    private static void getSeparatedZeroOne(int[] arr) {

        int size = arr.length;
        int count = 0;

        for (int i = 0; i <size - 1; i ++){
            if (arr[i] == 0){
                count ++;
            }
        }

        for (int j = 0; j < count; j ++){
            arr[j] = 0;
        }

        for (int k =  count; k < size -1;  k ++){
            arr[k] = 1;
        }


        for (int i = 0; i <size; i ++){
            System.out.println("");
            System.out.println("=============>"+arr[i]);
        }

    }
}
