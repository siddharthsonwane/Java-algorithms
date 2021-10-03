package com.main.interview;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class linkedListDemo {
    public static void main(String[] args) {
        List<String> data =  new ArrayList<>();
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");

        Iterator iterator = data.iterator();
        while (iterator.hasNext()){

            String value = (String) iterator.next();

            if (value.equals("2")){
                data.remove(value);
            }
            System.out.println("::::::::::::::::"+value);
        }
    }
}
