package com.kizhaku.learn.dsa.tree;

import java.util.NoSuchElementException;

/**
 * Binary Search Tree
 *  - Allows duplicate. Keeps right
 *  - In order traversal.
 */

public class BinarySearchTree {
    private TreeNode root;

    public void add(int item) {
        TreeNode newNode = new TreeNode(item);
        TreeNode currentNode = root;

        if (root == null) {
           root = newNode;
        } else {
            while (true) {
                if (item < currentNode.getItem()) {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        return;
                    }
                    currentNode = currentNode.getLeft();
                } else {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(newNode);
                        return;
                    }
                    currentNode = currentNode.getRight();
                }
            }
        }
    }

    public boolean find(int item) {
        if (root == null)
            throw new NoSuchElementException();

        return findRecursively(root, item);
    }

    public void print() {
        if (root == null)
            throw new NoSuchElementException();

        printInorder(root);
    }

    public void printPostOrder() {
        if (root == null)
            throw new NoSuchElementException();

        printPostOrder(root);
        System.out.println(root.getItem());
    }

    public void printPreOrder() {
        if (root == null)
            throw new NoSuchElementException();

        System.out.println(root.getItem());
        printPreOrder(root);
    }

    private boolean findRecursively(TreeNode currentNode, int item) {
        if (currentNode == null)
            return false;

        if (item == currentNode.getItem())
            return true;

        if (item < currentNode.getItem()) {
            return findRecursively(currentNode.getLeft(), item);
        } else {
            return findRecursively(currentNode.getRight(), item);
        }
    }

    private void printInorder(TreeNode currentNode) {
        if (currentNode != null) {
            printInorder(currentNode.getLeft());
            System.out.println(currentNode.getItem());
            printInorder(currentNode.getRight());
        }
    }

    private void printPostOrder(TreeNode currentNode) {
        if (currentNode != null) {
            printPostOrder(currentNode.getLeft());

            if (currentNode != root)
                System.out.println(currentNode.getItem());

            printPostOrder(currentNode.getRight());
        }
    }

    private void printPreOrder(TreeNode currentNode) {
        if (currentNode != null) {
            printPreOrder(currentNode.getLeft());

            if (currentNode != root)
                System.out.println(currentNode.getItem());

            printPreOrder(currentNode.getRight());
        }
    }

}
