package com.kizhaku.learn.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Map<Integer, Boolean> numSingleStatus = new HashMap<>();
        Set<Integer> singleNum = new HashSet<>();


        if(nums.length == 1)
            return nums[0];

        for (Integer n : nums) {
            if(numSingleStatus.containsKey(n) && numSingleStatus.get(n))
                numSingleStatus.put(n, false);
            else
                numSingleStatus.put(n, true);
        }

        for (Map.Entry<Integer, Boolean> entry : numSingleStatus.entrySet()) {
            if (entry.getValue())
                return entry.getKey();
        }

        /*
        return numSingleStatus.entrySet()
                .stream().parallel()
                .filter(Map.Entry::getValue)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        */

        return 0;
    }

    public int singleNumber2(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        Set<Integer> singleNum = new HashSet<>();

        for (Integer n : nums) {
            if(singleNum.contains(n))
                singleNum.remove(n);
            else
                singleNum.add(n);
        }

        return singleNum.iterator().next();
    }
}
