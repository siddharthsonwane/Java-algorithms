package com.main.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayContainValue {

    public static void main(String[] args) {


        int[] input = new int[]{1, 2, 3, 4, 5};
        
        int toFind = 3;
        
        boolean found = IntStream.of(input).anyMatch(n -> n == toFind);

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");



        String[] strings = {"One","Two","Three","Four","Five"};
        String toFindString= "Four";

        boolean toFind2 = Arrays.stream(strings).anyMatch(s ->s.equals(toFindString));



        //  System.out.printf("Does array %s has %s? %b %n", Arrays.toString(input), 5,isExists(input, 5));
       // System.out.printf("Does array %s contains %s? %b %n", Arrays.toString(input), 5, contains(input, 5));

     

    }

    public static <T> boolean contains(final T[] array, final T v)
     {
         for (final T e : array)
         {
          if (e == v || v != null && v.equals(e))
          {
             return true;
          }
       }
     return false;
    }



    public static <T> boolean isExists(final T[] array, final T object) { return Arrays.asList(array).contains(object);
    }


}
