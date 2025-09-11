package test;

import com.kizhaku.learn.problems.Palindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class TestPalindrome {

    private final Palindrome palindrome = new Palindrome();
    private Map<Integer, Boolean> input;
    //private int[] input = {121, -121, 10, 21, 22, 323, -323};

    @BeforeEach
    public void init() {
        input = Map.of(121, true, -121, false, 10, false,
                21, false, 22, true, 323, true, -323, false);
    }

    @Test
    public void testPalindromeInteger() {
        input.forEach((k, v) -> assertEquals(v, palindrome.isPalindrome(k)));

        //input.forEach((k, v) -> palindrome.isPalindrome(k));
    }

}
