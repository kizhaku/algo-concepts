package test;


import com.learn.leetcode.TwoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    public void testApp() {
        int[] input1 = {11,7,2,15};
        int[] input2 = {3,2,4};
        int[] input3 = {3,3};
        int[] input4 = {0,4,3,0};
        int[] input5 = {-3,4,3,90};
        int target1 = 9;
        int target2 = 6;
        int target3 = 6;
        int target4 = 0;
        int target5 = 0;
        int[] output1 = {1,2};
        int[] output2 = {1,2};
        int[] output3 = {0,1};
        int[] output4 = {0,3};
        int[] output5 = {0,2};

        assertArrayEquals(output1, twoSum.twoSum(input1, target1), "{1,2}");
        assertArrayEquals(output2, twoSum.twoSum(input2, target2), "{1,2}");
        assertArrayEquals(output3, twoSum.twoSum(input3, target3), "{0,1}");
        assertArrayEquals(output4, twoSum.twoSum(input4, target4), "{0,3}");
        assertArrayEquals(output5, twoSum.twoSum(input5, target5), "{0,2}");

    }
}
