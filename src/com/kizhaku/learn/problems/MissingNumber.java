package com.kizhaku.learn.problems;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 *
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 *
 * Explanation:
 * n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 *
 * Example 2:
 * Input: nums = [0,1]
 *
 * Output: 2
 * Explanation:
 * n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 *
 * Example 3:
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 *
 * Explanation:
 * n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 */

public class MissingNumber {

    public int missingNumber(int[] nums) {
        //Create a set and add nums to the set.
        Set<Integer> numbers = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        int missingNumber = 0;

        //Loop through array index to check if any number is missing.
        // Exit and return the missing number
        for (int i = 0; i <= nums.length; i++) {
            if(!numbers.contains(i)) {
                missingNumber = i;
                break;
            }
        }

        return missingNumber;
    }

    public int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        int missingNumber = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] - i) != 0) {
                missingNumber = i;
                break;
            }
        }

        return missingNumber;
    }

    public int missingNumber3(int[] nums) {
        int missingNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            missingNumber += nums[i] - (i + 1);
        }

        return Math.abs(missingNumber);
    }
}
