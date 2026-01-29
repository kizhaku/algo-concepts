package com.kizhaku.learn.problems;

public class Palindrome2 {

    public static boolean isPlaindrome(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return str.contentEquals(sb);
    }
}
