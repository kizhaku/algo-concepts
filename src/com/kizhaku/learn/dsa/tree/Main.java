package com.kizhaku.learn.dsa.tree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(50);
        tree.add(20);
        tree.add(10);
        tree.add(70);
        tree.add(80);
        tree.add(10);
        tree.add(5);
        tree.add(15);

        tree.print();

        System.out.println(String.format("Is %s present in the tree: ", 5) +tree.find(5));
    }
}
