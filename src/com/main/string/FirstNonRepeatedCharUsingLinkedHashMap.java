package com.main.string;

import java.util.*;

public class FirstNonRepeatedCharUsingLinkedHashMap {

    public static void main(String[] args) {

        String work ="hello";

        //char result = getFirstNonRepeatedChar(work);
        //System.out.println("=>"+result);

      //  char result2 = getFirstNonRepeatedCharSetList(work);
       // System.out.println("=> "+result2);


        char result3 = getFirstNonRepeatedHashMap(work);
        System.out.println("=> "+result3);

    }

    private static char getFirstNonRepeatedHashMap(String work) {

        Map<Character, Integer> scorecard = new HashMap<>();

        for(int  i = 0; i < work.length(); i ++){

            char c = work.charAt(i);
            if (scorecard.containsKey(c)){
                
                scorecard.put(c, scorecard.get(c) + 1);
                
            }else {
                scorecard.put(c,1);
            }

        }

        for (int  i =0; i<work.length(); i ++){

            char ch = work.charAt(i);
            if (scorecard.get(ch) == 1){
                return ch;
            }

        }

        throw  new RuntimeException("not found...........");
    }


    private static char getFirstNonRepeatedCharSetList(String work) {

        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();

        for (int i = 0; i < work.length();  i++){
            char letter = work.charAt(i);
            if (repeating.contains(letter)){
                continue;
            }

            if (nonRepeating.contains(letter)){
                nonRepeating.remove((Character)letter);
                repeating.add(letter);
            }else {
                nonRepeating.add(letter);
            }

        }

         return nonRepeating.get(0);

    }

    private static char getFirstNonRepeatedChar(String work) {

     Map<Character, Integer> count = new LinkedHashMap(work.length());

     for (char ch : work.toCharArray()){

         count.put(ch, count.containsKey(ch) ? count.get(ch) + 1 : 1);
     }

     for (Map.Entry<Character, Integer> entry : count.entrySet()){

         if (entry.getValue()  ==1){
             return entry.getKey();

         }
      }
       throw new RuntimeException("didn't find any non repeated Character");
    }


}
