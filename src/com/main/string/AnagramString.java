package com.main.string;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {

        String word = "stop";
        String anagram = "post";

//      boolean result =  isAnagramSstring(word, anagram);
      
//      boolean result2 =  isAnagramStringuUsingTwoArray(word, anagram);

        boolean result3 = isAnagramStringuUsingStringBuffer(word,anagram);

      if (result3)
          System.out.println("anagram");
      else
          System.out.println("not anagram");

    }

    private static boolean isAnagramStringuUsingStringBuffer(String word, String anagram) {

     char[]  charactors = word.toCharArray();

     StringBuilder sbAnagram = new StringBuilder(anagram);

     for (char c : charactors){

         int index = sbAnagram.indexOf(""+c);

         if (index != -1){

             sbAnagram.deleteCharAt(index);

         }else {

             return false;
         }

     }

     return sbAnagram.length() == 0 ? true:false;

    }

    private static boolean isAnagramStringuUsingTwoArray(String word, String anagram) {

        char[] wordArray = word.toCharArray();
        char[] anagramArray = anagram.toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);

        return Arrays.equals(wordArray,anagramArray);

    }

    private static boolean isAnagramSstring(String word, String anagram) {

        if (word.length()!=anagram.length()){
           return false;

        }

        char[] chars = word.toCharArray();

         for (char ch : chars){
             int index = anagram.indexOf(ch);

             if (index != -1){

                 anagram = anagram.substring(0, index) + anagram.substring(index + 1,anagram.length());

             }else {
                 return false;
             }


         }

        return anagram.isEmpty();
    }

}
