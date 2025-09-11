package com.kizhaku.learn.problems;

public class ReverseString {

    public static void reverseString(char[] s) {
        char temp;
        int strLength = s.length;
        int j = strLength - 1;

        for (int i = 0; i < (strLength / 2); i++) {
            temp = s[i];
            //swap
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }

    public static void reverseString2(char[] s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i <s.length; i++) {
            reversed.insert(0, s[i]);
        }

        System.out.println(reversed.toString());
    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);

        for (char c : s) {
            System.out.println(c);
        }
    }
}
