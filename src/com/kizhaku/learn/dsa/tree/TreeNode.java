package com.kizhaku.learn.dsa.tree;

public class TreeNode {

    private final int item;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
