package com.learn.leetcode;

import java.util.*;
import java.util.stream.Stream;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */

public class Anagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        char[] sortedArr1 = s.toCharArray();
        Arrays.sort(sortedArr1);

        char[] sortedArr2 = t.toCharArray();
        Arrays.sort(sortedArr2);


        return Arrays.equals(sortedArr1, sortedArr2);
    }
}
