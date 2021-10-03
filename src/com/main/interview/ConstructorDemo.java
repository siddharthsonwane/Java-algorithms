package com.main.interview;

public class ConstructorDemo {

    float price;
    String Name;
    String Value;

    ConstructorDemo(){
        price = 0;
        Name = "Sid";
        Value = "Sonwane";
    }

   ConstructorDemo(String name, String value){
        super();

         Name = name;
         Value = value;
   }


    public static void main(String[] args) {
        ConstructorDemo constructorDemo1 =  new ConstructorDemo();
       // System.out.println("============>"+constructorDemo1.name+""+constructorDemo1.Value+""+constructorDemo1.price);

        ConstructorDemo constructorDemo = new ConstructorDemo("A","B");
        System.out.println("============>"+constructorDemo.Name+""+constructorDemo.Value+""+constructorDemo.price);

    }

}
