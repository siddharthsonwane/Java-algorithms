package com.main.twopointer;

public class SortColour {
    public static void main(String[] args) {
        int nums[] ={2,0,2,1,1,0};
        softColour(nums);
    }

    private static void softColour(int[] nums) {


        int wall = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] < 1){
                int temp = nums[i];
                nums[i] = nums[wall];
                nums[wall] = temp;
                wall ++;
            }
        }
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == 1){
                int  temp = nums[i];
                nums[i] = nums[wall];
                nums[wall] = temp;
                wall ++;
            }
        }
    }
}
