package com.main.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        MergeSort mergeSortObj = new MergeSort();
        mergeSortObj.mergerSort(arr,0 , arr.length -1);
        mergeSortObj.printMergeArray(arr);
    }

    private void printMergeArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    private void mergerSort(int[] arr, int start, int end) {

        if (start < end){
            int mid = (start + end) / 2;
            mergerSort(arr, start ,mid);
            mergerSort(arr, mid + 1, end);
            merge(arr,start,mid,end);
        }



    }

    private void merge(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1 , k = 0;

        while (i <= mid && j <= end){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i];
                i ++;
                k++;
            }else {
                temp[k] = arr[j];
                k ++;
                j ++;
            }
        }

        while (i <= mid){
            temp[k] = arr[i];
            i ++;
            k ++;
        }
        while (j <= end){
            temp[k] = arr[j];
            k++;
            j++;

        }

        for (i = start;i <= end; i ++){
            arr[i] = temp[i - start];

        }

    }
}
