package com.main.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ActivationFountaio {

    public static void main(String[] args) {
        int arr[] = {1 ,2,1};
        int length = arr.length;

        System.out.println("============>"+minCountFountation(arr,length));


    }

    private static int minCountFountation(int[] arr, int length) {
        Map<Integer, Set<Integer>> m = new HashMap<>();
        int[] dp = new int[length+2];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) continue;
            int mn = i - arr[i];
            int mx = i + arr[i];
            for (int j = Math.max(mn, 0); j < Math.min(arr.length, mx); j++){
                dp[j] = Math.max(dp[j], mx);
            }
        }
        int curr = 0;
        int res = 0;
        while (curr < arr.length){
            if (curr == arr.length - 1) return res;
            if (dp[curr] == 0) return -1;
            curr = dp[curr];
            res++;
        }
        if (curr < arr.length) return -1;
        return res;
        
    }

}
