package com.main.string;

import java.util.Stack;

public class IsPalindromeString {
    public static void main(String[] args) {
        String s ="aba";
        System.out.println("palindrome:"+findLongestPalindromeString(s));
    }

    private static boolean findLongestPalindromeString(String s) {
        char chars[] = s.toCharArray();
        Stack<Character>characters = new Stack<>();
        for (char c : chars){
            characters.add(c);
        }
        for (int i = 0;i < chars.length; i ++){
            if (characters.peek() == chars[i]){
                characters.pop();
            }else {
                return false;
            }

        }
        return characters.isEmpty() || characters.size() == 1;
    }
}
