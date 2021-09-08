package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerToRoman {


    public static void main(String[] args) {


        IntegerToRoman IR = new IntegerToRoman();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Inter number to convert:");

        int input = scanner.nextInt();

      String romanNumber =  IR.intToRoman(input);

        System.out.println(":::::::::::::::::::::::::"+romanNumber);



    }

    public String intToRoman(int num) {
        List<Node> list = new ArrayList<>();
        list.add(new Node(1, "I"));list.add(new Node(4, "IV"));list.add(new Node(5, "V"));list.add(new Node(9, "IX"));
        list.add(new Node(10, "X"));list.add(new Node(40, "XL"));list.add(new Node(50, "L"));list.add(new Node(90, "XC"));
        list.add(new Node(100, "C"));list.add(new Node(400, "CD"));list.add(new Node(500, "D"));list.add(new Node(900, "CM"));list.add(new Node(1000, "M"));
        StringBuffer sb = new StringBuffer();
        for (int i = list.size() - 1; i >= 0; i--) {
            Node n = list.get(i);
            int val = n.val;
            int count = num / val;
            num %= val;
            while (count-- > 0) {
                sb.append(n.s);
            }
            if (num == 0) {
                break;
            }
        }
        return sb.toString();
    }
    class Node {
        int val;
        String s;
        public Node(int val, String s) {
            this.val = val;
            this.s = s;
        }
    }
}