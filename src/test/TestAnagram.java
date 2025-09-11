package test;

import com.kizhaku.learn.problems.Anagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAnagram {

    private Anagram anagram = new Anagram();

    @BeforeEach
    void init() {
    }

    @Test
    public void testAnagram() {
        assertTrue(anagram.isAnagram("anagram", "nagaram"), "Testing anagram");
        assertFalse(anagram.isAnagram("rat", "car"), "Testing rat");
    }
}
