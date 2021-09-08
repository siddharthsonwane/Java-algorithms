package com.main.array;

import java.util.*;

public class DuplicateElementInteger {

    public static void main(String[] args) {

        int[] values = {1,1,2,3,4,4,5,5,5,5,6};

        //findDuplicateElementHashMap(values);
        findDuplicateElementSet(values);

    }

    private static void findDuplicateElementSet(int[] values) {

        Set value = new HashSet();

        for (int  i = 0; i < values.length; i ++){

            if (value.add(values[i]) == false){
                System.out.println("Duplicate Element:" + values[i]);
            }/*else {

                value.add(values[i]);
            }*/

        }

        /*Iterator<Integer> iterator = value.iterator();

        while (iterator.hasNext()){

            System.out.println("Duplicate Element Values :"+iterator.next());
        }*/

    }

    private static void findDuplicateElementHashMap(int[] values) {

        Map<Integer, Integer> valueAndCount = new HashMap<>();

        for (Integer  value : values ){

            Integer count = valueAndCount.get(value);

            if (count == null ){

                valueAndCount.put(value , 1);
            }else {

                valueAndCount.put(value, ++count);
            }

        }


        Set<Map.Entry<Integer, Integer>>entries = valueAndCount.entrySet();

          for(Map.Entry<Integer, Integer> entry : entries){

              if(entry.getValue() > 1){

                  System.out.println("Duplicate element in array:"+entry.getKey());

              }

          }

    }

}
