package com.learn.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 * Input: s = "([])"
 * Output: true
 *
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> bracketRules = Map.of('(', ')', '{', '}', '[' , ']');
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(bracketRules.get(c) != null)
                stack.push(c);
            else if (stack.isEmpty() || !bracketRules.get(stack.pop()).equals(c))
                return false;
        }

        return stack.isEmpty();
    }
}
