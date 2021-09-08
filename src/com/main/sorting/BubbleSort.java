package com.main.sorting;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort bubbleSort  = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Sorted array is:");
        bubbleSort.printSortedArray(arr);

    }

    private void printSortedArray(int[] arr)
    {

        for (int k = 0; k < arr.length; k ++){
            System.out.println(arr[k]);
        }
    }

    private void sort(int[] arr)
    {
        int n = arr.length;
        for (int  i = 0; i < n - 1; i ++)
        {
            for (int j = 0; j < n - i - 1; j ++)
            {
                if (arr[j] > arr[j + 1])
                {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                }
            }
        }
    }
}
