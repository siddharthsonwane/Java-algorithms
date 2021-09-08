package com.main.thread;

import com.sun.javafx.scene.control.skin.TableColumnHeader;

public class ThreadSynchronizes {
    private int count;
    public synchronized int incrementCount(){
        count ++;
        return count;
    }

    public static void main(String[] args) {

        ThreadSynchronizes threadSynchronizes = new ThreadSynchronizes();
        threadSynchronizes.incrementCount();
        

    }
}
