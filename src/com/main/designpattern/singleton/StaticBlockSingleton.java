package com.main.designpattern.singleton;


// https://www.java2novice.com/java_interview_questions/spring-singleton-thread-safe/

//https://github.com/elifraha/beans_mutability/tree/master/src/main/java/com/orit/demo
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static {

        try {

            instance = new StaticBlockSingleton();

        }catch (Exception e){

            throw  new RuntimeException("Exception occured in creating singleton instance");

        }

    }

    public  static  StaticBlockSingleton getInstance(){

        return instance;
    }


    public static void main(String[] args) {
        System.out.println(":::::::"+StaticBlockSingleton.getInstance().hashCode());
        System.out.println("::::::::instance"+instance.hashCode());
    }
}
