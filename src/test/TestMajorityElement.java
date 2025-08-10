package test;

import com.learn.leetcode.MajorityElement;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class TestMajorityElement {

    private MajorityElement majorityElement = new MajorityElement();
    private Map<Integer[], Integer> input = Map.of(new Integer[]{3, 3, 4}, 3, new Integer[]{2,2,1,1,1,2,2}, 2
    , new Integer[]{3,2,3}, 3);

    @Test
    void testMajorityElement() {
        input.entrySet().forEach(e -> {
            assertEquals(e.getValue(), majorityElement.majorityElement(e.getKey()));
        });
    }
}
