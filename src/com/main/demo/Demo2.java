package com.main.demo;

public class Demo2 {

    public static void main(String[] args) {

         int n = 100;

         getResult(n);


    }

    private static void getResult(int n) {

        for(int i =0;i<=100; i++){

            if(i%3==0){
                System.out.println("Foo");

            }else if (i%5==0){
                System.out.println("Bar");

            }if (i%3==0 && i%5==0){
                System.out.println("FooBar");
            }

        }
    }


}
