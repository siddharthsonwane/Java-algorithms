package com.main;

import java.util.HashMap;
import java.util.Map;

public class TreeSetData {



    /*int show(int i){

        System.out.println("inside int");
         return i;
    }

    void show(int i){

        //return 0;

    }

     void show(){

        System.out.println("inside void");

    }*/

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("A",null);
        map.put("B",null);

        for (String s : map.keySet()){

            String a = map.get("A");
            System.out.println("::::"+a);

        }
        // https://betterprogramming.pub/differences-between-git-merge-and-rebase-and-why-you-should-care-ae41d96237b6





        //TreeSetData treeSetData = new TreeSetData();



       // System.out.println("::::"+treeSetData.show(5));

      /*  Set set = new TreeSet();

        set.add(1);
        set.add("2");
       // set.add(3);

        Iterator iterator = set.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next());

        //System.out.println(":::::::"+set.size());


*/



    }

}
