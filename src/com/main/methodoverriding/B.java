package com.main.methodoverriding;

public class B {

  B get(){

      System.out.println("class B");
      return this;
  }


    public static void main(String[] args) {

      B b = new B();



      b.get();


    }

}



