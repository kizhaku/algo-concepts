package test;

import com.kizhaku.learn.problems.LongestSubstring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class TestLongestSubstring {
    private Map<String, Integer> input;
    private LongestSubstring longestSubstring;

    @BeforeEach
    void init() {
        input = new HashMap<>();
        input.put("abcabcbb", 3);
        input.put("bbbbb", 1);
        input.put("pwwkew", 3);
        input.put("tmmzuxt", 5);
        input.put("", 0);

        longestSubstring = new LongestSubstring();
    }

    @Test
    void testLongestSubString() {
        input.forEach((key, value) -> {
            assertEquals((int) value, longestSubstring.lengthOfLongestSubstring(key),
                    () -> "Input: " +key);
        });
    }
}
