package com.main.twopointer;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int nums[] ={2,3,1,2,4,3};
        int s = 7;

         System.out.println(getMinSubArray(nums,s));

    }

    private static int getMinSubArray(int[] nums, int s) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int  i = 0;
        int j = 0;
        int result = Integer.MAX_VALUE;
        int  total = 0;
        while (i < nums.length){
            total +=  nums[i ++];
            while (total >= s){
                result = Math.min(result, i - j);
                total -= nums[j ++];
            }
        }

        return  result == Integer.MAX_VALUE ? 0 : result;
    }
}
