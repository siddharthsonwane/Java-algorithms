package com.main.array;

public class ArrayPairUsingFirstSecondPointer {


    public static void main(String[] args) {

        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };

        printPairs(numbers, 9);


    }

    private static void printPairs(int[] numbers, int sum) {

      for (int i =0; i < numbers.length; i ++){

          int first = numbers[i];

          for (int j = i + 1; j < numbers.length; j ++){

              int second = numbers[j];

              if ((first + second) == sum){

                  System.out.printf("(%d, %d) %n", first, second);

              }

          }

      }



    }


}
