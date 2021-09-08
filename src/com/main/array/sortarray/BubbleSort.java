package com.main.array.sortarray;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.sort(arr);
        System.out.println("Bubble sorted array:");
        bubbleSort.printSortedArray(arr);
    }

    private void printSortedArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i<len; i++){
            System.out.println(arr[i]);
        }
    }

    private void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i ++){
                for (int j = 0; j < length - i -1; j ++){
                    if (arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
          }
    }
}
