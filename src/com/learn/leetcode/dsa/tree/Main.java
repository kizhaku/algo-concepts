package com.learn.leetcode.dsa.tree;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeImpl<Integer> tree = new TreeImpl<>();
        tree.add(1);
        tree.add(2);
        tree.add(3);

        tree.print();
    }
}
