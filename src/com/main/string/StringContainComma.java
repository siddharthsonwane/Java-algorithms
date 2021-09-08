package com.main.string;

public class StringContainComma {

    public static void main(String[] args) {


       String s=  "Sidd,harth";

       if (s.contains(",")){

           String[]arr = s.split(",");

           String s1 = arr[0];
           String s2 = arr[1];

           System.out.println(s1+":::::::::"+s2);
       }

    }

}
