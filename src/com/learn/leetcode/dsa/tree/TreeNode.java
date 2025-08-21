package com.learn.leetcode.dsa.tree;

public class TreeNode<T extends Integer> {

    T item;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T item, TreeNode<T> left, TreeNode<T> right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }

    public T getItem() {
        return item;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}
