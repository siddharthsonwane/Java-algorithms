package com.main.java8;

import java.util.*;

public class CountVowelsandConsonants {
    static final Set<Character> allVowels = new HashSet(Arrays.asList('a','e','i','o','u'));
    public static void main(String[] args) {

      String inputString = "sourcecodeexamples";
      long vowels = inputString.chars()
              .filter(c ->allVowels.contains((char)c)).count();
      long consonate = inputString.chars()
              .filter(c ->!allVowels.contains((char)c))
              .filter(ch ->(ch >='a' && ch <= 'z'))
              .count();
        System.out.println("count vowels:"+vowels);
        System.out.println("count consonant:"+consonate);



        /*String inputString = "sourcecodeexamples";
       List<Character> vowels = new ArrayList(Arrays.asList('a','e','i','o','p'));
       long countVowels = 0;
       long countConsonant = 0;
       inputString = inputString.toLowerCase();

       countVowels = inputString.chars()
               .filter(c ->vowels.contains((char)c)).count();

        System.out.println("::::::::"+countVowels);*/

    }
}
