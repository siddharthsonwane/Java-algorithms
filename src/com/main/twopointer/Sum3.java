package com.main.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {

        int nums[] = {-1, 0, 1, 2, -1, -4};

        get3SumElement(nums);


    }

    private static List<List<Integer>> get3SumElement(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i ++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j =  i + 1;
            int k = nums.length - 1;
            int target = -nums[i];
            while (j < k){
                if (nums[j] + nums[k] == target){
                    ArrayList<Integer>temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    temp.add(k);
                    result.add(temp);
                    j ++;
                    k --;
                    while (j < k && nums[j] == nums[j - 1]){
                        j ++;
                    }
                    while (j < k && nums[k] == nums[k + 1]){
                        k --;
                    }
                }else if(nums[j] + nums[k] > target){
                    k --;

                }else {
                    j ++;
                }
            }

        }
        System.out.println(result.toArray());
        return result;
     }
}
