package com.main.string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInCharacters {


    public static void main(String[] args) {

        findDuplicate("Siddharth");

    }

    private static void findDuplicate(String word) {

        char[] characters = word.toCharArray();

        Map<Character,Integer> charMap = new HashMap();

        for (Character ch : characters){

            if (charMap.containsKey(ch)){

                charMap.put(ch,charMap.get(ch) + 1);

            }else{

                charMap.put(ch, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()){

            if(entry.getValue() > 1){
                System.out.println("Duplicate characters:"+entry.getKey() + " => "+entry.getValue());
            }
        }

    }
}
