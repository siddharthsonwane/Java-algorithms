package com.main.array;



//How to find duplicate number on Integer array in Java

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {

    public static void main(String[] args) {



        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

        findDuplicate(names);


    }

    private static void findDuplicate(String[] names) {

        Map<String, Integer>nameAndCount = new HashMap<>();

        for (String name : names){

            Integer  count = nameAndCount.get(name);
            if (count == null){
                nameAndCount.put(name,1);

            }else {

                nameAndCount.put(name, ++count);
            }

        }

        Set<Map.Entry<String, Integer>> entries = nameAndCount.entrySet();

         for (Map.Entry<String, Integer> entry:entries){

             if (entry.getValue() > 1){
                 System.out.println("Duplicate element form array:"+entry.getKey());
             }

         }


    }
}
