package com.main.designpattern.singleton;
//https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(":::::::::::::::"+EagerInitializedSingleton.getInstance().hashCode());
    }

}
