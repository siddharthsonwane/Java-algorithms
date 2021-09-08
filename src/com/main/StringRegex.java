package com.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {

    public static void main(String[] args) {
        System.out.println("----------------");

        String s = "Winterallee 3";


        Pattern p = Pattern.compile("[A-Za-z]");
        Matcher m = p.matcher("Winterallee 3");

        boolean b = m.matches();
        System.out.println(b);

     boolean bb =  StringRegex.isMatchingRegex(s);

        System.out.println(bb);

    }


    private static final Pattern[] inputRegexes = new Pattern[6];

    static {

        inputRegexes[0] = Pattern.compile(".*[A-Z].*");
        inputRegexes[1] = Pattern.compile(".*[a-z].*");
        inputRegexes[2] = Pattern.compile(".*\\d.*");
        inputRegexes[3] = Pattern.compile(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*");
        inputRegexes[4] = Pattern.compile("[A-Z][a-z]*");
        inputRegexes[5] = Pattern.compile("([A-Za-z]+)(\\s+)");
    }



    private static boolean isMatchingRegex(String input) {
        boolean inputMatches = true;
        for (Pattern inputRegex : inputRegexes) {
            if (!inputRegex.matcher(input).matches()) {
                inputMatches = false;
            }
        }
        return inputMatches;
    }


}
