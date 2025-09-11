package test;

import com.kizhaku.learn.dsa.tree.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBinarySearchTree {
    private static BinarySearchTree tree = new BinarySearchTree();
    private int[] input;

    @BeforeEach
    public void init() {
        input = new int[]{50, 20, 10, 70, 80, 10, 5, 15, 23, 1};
        for (int item : input) {
            tree.add(item);
        }
    }

    @Test
    public void testBinarySearchTree() {
        assertTrue(tree.find(50));
        assertTrue(tree.find(10));
        assertTrue(tree.find(5));
        assertTrue(tree.find(1));
        assertFalse(tree.find(21));
        assertFalse(tree.find(11));
        assertFalse(tree.find(2));
        assertFalse(tree.find(13));
    }
}
