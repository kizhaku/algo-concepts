package test;

import com.kizhaku.learn.problems.RemDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemDuplicates {

    private final RemDuplicates remDuplicates = new RemDuplicates();
    int[] arr1 = {1, 1, 2};
    int[] arr2 = {0,0,1,1,1,2,2,3,3,4};

    @Test
    public void testPalindromeInteger() {
        assertEquals(2, remDuplicates.removeDuplicates(arr1));
        assertEquals(5, remDuplicates.removeDuplicates(arr2));
    }

}
