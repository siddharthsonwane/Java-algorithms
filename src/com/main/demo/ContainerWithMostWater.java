package com.main.demo;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int arr[] = new int[]{5,6,9,9,8,7,5,2,6,5,5,};

        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

        System.out.println(":::::::"+containerWithMostWater.maxArea(arr));


    }


    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length -1;
        int max = 0;

        while(l < r){


            int lh = height[l];
            int rh = height[r];
            int min_h = Math.min(lh,rh);

            int len = r - l;

            int curr_area = min_h*len;

            max = Math.max(max , curr_area);

            if(lh < rh) l++;
            else r --;

        }

        return max;

    }


}
