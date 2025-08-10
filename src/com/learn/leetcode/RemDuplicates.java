package com.learn.leetcode;

import java.util.Arrays;

public class RemDuplicates {

    public int removeDuplicates(int[] nums) {
        int[] expectedNums = Arrays.stream(nums)
                .distinct()
                .toArray();

        for (int i = 0; i < nums.length; i++) {
            if (i < expectedNums.length)
                nums[i] = expectedNums[i];
        }

        return expectedNums.length;
    }
}
