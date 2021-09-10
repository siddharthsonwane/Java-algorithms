package com.main.string;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String s ="forgeeksskeegfor";
        findLongestPalindrome(s);
    }

    private static String findLongestPalindrome(String s) {

         int size = s.length();
          if (s.length() < 2)
              return s;
          Set<String> palindromes = new HashSet<>();
          String lp = "";
          String test = "";
          for (int i = 0; i < size; i ++){
              test = s.substring(0,i + 1);
              lp = getPalindrome(palindromes, lp, test);
          }
          for (int i = size -1; i > size / 2; i-- ){
              for (int j = 0;j < size / 2;  j++){
                  test = s.substring(j , i);
                  lp = getPalindrome(palindromes, lp, test);
              }
          }

          for (int i = 0; i < size / 2; i++){
              for (int j = size; j > size / 2; j --){
                  test = s.substring(i ,j);
                  lp = getPalindrome(palindromes, lp, test);
              }
          }


        return  lp;
    }

    private static String getPalindrome(Set<String> palindromes, String lp, String test) {
        if (isPalindrome(test) && (test.length() > lp.length())) {
            lp = test;
            palindromes.add(test);
            System.out.println("================>" + test);

        }
        return lp;
    }

    private static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> characters = new Stack<>();

        for (char x : chars) {
            characters.add(x);
        }
        for (int i = 0; i < chars.length; i++) {
            if (characters.peek() == chars[i]) {
                characters.pop();
            } else {
                return false;
            }
        }
        return characters.isEmpty() || characters.size() == 1;
    }
}
