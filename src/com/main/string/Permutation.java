package com.main.string;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        int length = str.length();
        Permutation  permutation = new Permutation();
        permutation.permute(str,0,length-1);
    }

    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    private String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
