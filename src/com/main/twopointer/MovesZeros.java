package com.main.twopointer;

public class MovesZeros {
    public static void main(String[] args) {
        int nums[]={12,0,1,2,0,0,7,3};
        movesZeros(nums);
    }

    private static void movesZeros(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int count  = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] != 0){
                nums[count] = nums[i];
                count ++;
            }
        }
        for (int i = count; i < nums.length;  i++){
            nums[i] = 0;
        }
    }
}
