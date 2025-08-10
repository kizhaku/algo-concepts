package com.learn.leetcode;

import java.util.*;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 */

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = Arrays.stream(strs)
                .min(Comparator.comparingInt(String :: length))
                .get();
        prefix = checkPrefix(strs, prefix, prefix.length(), 0);

        return prefix;
    }


    public static String checkPrefix(String[] strs, String prefix, int prefixLength, int index) {
        if(prefixLength == 0) return "";

        for ( ; index < strs.length; index++) {
            if (!strs[index].substring(0, prefixLength).equals(prefix)) {
                prefixLength--;
                prefix = prefix.substring(0, prefixLength);

                return checkPrefix(strs, prefix, prefixLength, index);
            }
        }

        return prefix;
    }
}
