package com.main.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Sorted array:");
        selectionSort.printSortedArray(arr);

    }

    private void printSortedArray(int[] arr) {

        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
            //System.out.println();
        }
    }

    private void sort(int[] arr) {

        int length = arr.length;
        for (int i = 0; i<length - 1; i++){
            int mid_inx =  i;
            for (int j = i + 1; j < length; j++){
                if (arr[j] < arr[mid_inx]){
                    mid_inx  = j;
                }
            }

            int temp = arr[mid_inx];
            arr[mid_inx] = arr[i];
            arr[i] = temp;
        }

    }



}
