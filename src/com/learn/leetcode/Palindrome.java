package com.learn.leetcode;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class Palindrome {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String input = String.valueOf(x);

        if(x < 0) return false;

        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        return input.contentEquals(sb);
    }

    public static class HouseRobber {

        public int rob(int[] nums) {
            int size = nums.length;

            if(size == 1)
                return nums[0];

            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;

            if (size > 2)
                sum3 = nums[0] + nums[size-1];

            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0)
                    sum1 += nums[i];
                else
                    sum2 += nums[i];
            }

            return Math.max(sum1, Math.max(sum2, sum3));
        }
    }
}
