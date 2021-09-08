package com.main.array.sortarray;

public class SortArrayUsingTemp {

    public static void main(String[] args) {

        int arr[] = {5,4,6,7,8,2,3,1,9};

        sortArray(arr,arr.length);

    }

    private static void sortArray(int[] arr, int length) {

        int temp = 0;

        for (int i = 0; i<length; i++){

            for (int j = i +1; j <length; j++){
              if (arr[i] > arr[j]){

                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;

              }

            }

        }

        for (int k = 0; k<length;k++){
            System.out.println(":"+arr[k]);

        }

   }

}
