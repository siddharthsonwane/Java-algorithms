package com.main.interview;

import java.util.Arrays;

public class ActivateFountain {

    public static void main(String[] args) {
        int fountains[] = {1, 2, 1};

        System.out.println(getMinFountainRequired(fountains));
    }

    private static int getMinFountainRequired(int[] fountains) {
        int n = fountains.length;

        int interval[][] = new int[n][2];
        for (int i = 1; i <= n; i ++){
            interval[i - 1][0] = Math.max(i -  fountains[i  - 1], 1);
            interval[i - 1][1] = Math.min(i - fountains[i - 1],n);
        }
        Arrays.sort(interval,((o1, o2) -> {
            if (o1[0] == o2[0])
                return o2[1] - o1[1];
            return o1[0] - o2[0];
        }));

        int left, right;
        left = interval[0][0];
        right = interval[0][1];

        int fountainsActivate = 1;
        for (int i = 1; i < n; i++) {

            if (left <= interval[i][0] && right >= interval[i][1])
                continue;
            else {

                if (right < interval[i][1]) {
                    right = interval[i][1];
                    fountainsActivate++;
                }


            }

        }

        return fountainsActivate;
    }
}
