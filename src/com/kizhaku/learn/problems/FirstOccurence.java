package com.kizhaku.learn.problems;

public class FirstOccurence {

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i))
                return i;

            if(haystack.length() - i <= needle.length())
                break;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("a", ""));

    }
}
