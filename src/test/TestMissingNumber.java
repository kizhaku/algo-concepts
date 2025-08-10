package test;

import com.learn.leetcode.MissingNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMissingNumber {
    MissingNumber missingNumber = new MissingNumber();
    int[] input = {9,6,4,2,3,5,7,0,1};

    @Test
    void testMissingNumber() {
        assertEquals(8, missingNumber.missingNumber3(input));
    }
}
