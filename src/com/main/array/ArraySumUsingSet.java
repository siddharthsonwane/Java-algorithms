package com.main.array;

import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet {

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };

        printPairs(numbers, 9);


    }

    private static void printPairs(int[] numbers, int sum) {

        if (numbers.length < 2){
            return;
        }

        Set set = new HashSet(numbers.length);

        for (int value : numbers){

            int target = sum - value;

            if (!set.contains(target)){
                set.add(target);

            }else {

                System.out.printf("(%d, %d) %n",value,target);

            }

        }



    }

}
