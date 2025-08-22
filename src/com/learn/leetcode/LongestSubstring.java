package com.learn.leetcode;

import java.util.*;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();
        int maxLength = 0;
        int i = 0;
        Set<Character> charOfSubstring = new HashSet<>(); // Keep the substring.
        Map<Character, Integer> letterPosition = new HashMap<>(); // Keep track of last position of a character.

        while (i < stringLength) {
            Character curLetter = s.charAt(i);
            letterPosition.putIfAbsent(curLetter, i);

            /**
             * If substring contains the current letter, calculate if its max length and
             * reset the substring as duplicate has encountered.
             *
             * If not, then add the character to the substring char set.
             * Update the position of the character.
             * Position is to reset the substring search from last pos + 1
             */
            if (charOfSubstring.contains(curLetter)) {
                maxLength = Math.max(maxLength, charOfSubstring.size());

                if(curLetter.compareTo(s.charAt(i-1)) != 0)
                    i = letterPosition.get(curLetter) + 1;

                charOfSubstring.clear();
            } else {
                charOfSubstring.add(curLetter);
                letterPosition.put(curLetter, i);
                i++;
            }
        }

        return Math.max(maxLength, charOfSubstring.size());
    }

    public static int lengthOfLongestSubstring_revised(String s) {
        return 0;
    }
}
