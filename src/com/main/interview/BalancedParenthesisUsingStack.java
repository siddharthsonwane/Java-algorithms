package com.main.interview;

import java.util.Stack;

public class BalancedParenthesisUsingStack {
    public static void main(String[] args) {
        String str = "([{{[(())]}}])";
        Stack stk = new Stack<>();

        for (int i = 0;  i < str.length(); i ++){

            if (str.charAt(i) == '(' ||
                    str.charAt(i) == '[' ||
                    str.charAt(i) == '{'){
                stk.push(str.charAt(i));

            }else if(!stk.isEmpty()&&(
                    (str.charAt(i) == ']' &&(char)stk.peek() =='[')||
                            (str.charAt(i) == '}' && (char)stk.peek() =='{')||
                            (str.charAt(i) == ')' && (char)stk.peek() =='('))) {
                stk.pop();
             }else {
                stk.push(str.charAt(i));
            }
        }
        if (stk.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
