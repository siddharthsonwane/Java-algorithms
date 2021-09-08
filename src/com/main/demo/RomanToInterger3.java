package com.main.demo;

public class RomanToInterger3 {

    public static void main(String[] args) {


        String roman = "MCD";

        int result = romanToInteger(roman);
        System.out.println(":::"+result);


    }

    private static int romanToInteger(String roman) {

        if (roman == null) return 0;

        int length = roman.length();

        int sum = 0;
        int pre = 0;

        for (int i = length -1 ; i >=0; i --){

            int curr = romanTable(roman.charAt(i));
            if (i ==  length -1){
                sum = sum + curr;
            }else{

                if (curr < pre){

                    sum = sum - curr;

                }else {
                   sum = sum + curr;
                }

            }

            pre = curr;

         }
     return sum;
    }

    private static int romanTable(char c) {


        int num = 0;
        switch(c){
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
            default:
                num = 0;
                break;
        }
        return num;
    }


}
