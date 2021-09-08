package com.main.demo;

public class StringComparision {

    public static void main(String[] args) {

        /*String s = new String("ABC");

        String s1 = s;

        if(s.equals(s1)){

            System.out.println(true);

        }else{
            System.out.println(false);
        }*/



        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

       /* System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
*/
    }
}
