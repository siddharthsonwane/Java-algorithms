package com.main.demo;

import java.util.Arrays;

public class StringScrumble {

    public static void main(String[] args) {


        String s1 = "great";
        String s2 = "rgeat";

        if(isMatch(s1,s2)){
            System.out.println(true);

        }else {

            System.out.println(false);

        }


    }


    static public boolean isScramble(String s1, String s2) {
        if (!isMatch(s1, s2))
            return false;
        if (s1.length() == 0)
            return true;
        else if (s1.length() == 1) {
            if (s1.charAt(0) == s2.charAt(0))
                return true;
            return false;
        } else if (s1.length() == 2) {
            if (s1.charAt(0) == s2.charAt(0) && s1.charAt(1) == s2.charAt(1))
                return true;
            else if (s1.charAt(1) == s2.charAt(0)
                    && s1.charAt(0) == s2.charAt(1))
                return true;
            return false;
        }
        for (int i = 0; i < s1.length() - 1; i++) {
            if (isScramble(s1.substring(0, i + 1), s2.substring(0, i + 1))
                    && isScramble(s1.substring(i + 1, s1.length()),
                    s2.substring(i + 1, s1.length())))
                return true;
            if (isScramble(s1.substring(0, i + 1),
                    s2.substring(s1.length()-i-1, s1.length()))
                    && isScramble(s1.substring(i+1, s1.length()),
                    s2.substring(0, s1.length()-i-1)))
                return true;
        }
        return false;
    }

    static public boolean isMatch(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++)
            if (c1[i] != c2[i])
                return false;
        return true;
    }


}
