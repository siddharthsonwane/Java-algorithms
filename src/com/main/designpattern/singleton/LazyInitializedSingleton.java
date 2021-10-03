package com.main.designpattern.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton initializedSingleton;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if (initializedSingleton == null){
            initializedSingleton = new LazyInitializedSingleton();
        }
        return initializedSingleton;
    }
}
