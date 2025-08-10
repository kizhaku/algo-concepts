package test;

import com.learn.leetcode.BuySellStock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class TestBuySellStock {
    Map<Integer[], Integer> input = new HashMap<>();
    BuySellStock buySellStock = new BuySellStock();

    @BeforeEach
    public void init() {
        input.put(new Integer[]{7,1,5,3,6,4}, 5);
        input.put(new Integer[]{7,6,4,3,1}, 0);
    }

    @Test
    public void testBySellStock() {
        input.forEach((k,v) -> {
            assertEquals(v, buySellStock.maxProfit(k));
        });
    }
}
