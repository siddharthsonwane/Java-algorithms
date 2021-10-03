package com.main.interview;

public class A {
   /* public void display(){
        System.out.println("A");
    }*/
}

class B extends A{

    public void display() {
        System.out.println("B");
    }


}

class Demo{
    public static void main(String[] args) {
          A a = new B();



       //B b = new B();
       //b.display();
    }
}
