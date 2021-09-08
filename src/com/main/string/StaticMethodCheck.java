package com.main.string;

public class StaticMethodCheck {

    public static void main(String[] args) {

        int n = 100;
       // display(n);

        for (int i = 1; i < n; i++){

            if (i % 3 == 0){
                System.out.println("Foo:"+i);

            }
            if(i % 3 == 0 && i % 5 == 0){

                System.out.println("FooBar:" + i);
            }

        }

    }

    private static void display(int n) {

        for (int i = 1; i < n; i++){

            if (i % 3 == 0){
                System.out.println("Foo:"+i);

            }
            if(i % 3 == 0 && i % 5 == 0){

                System.out.println("FooBar:" + i);
            }

        }

        System.out.println(":::::::::::SID");

    }

}
