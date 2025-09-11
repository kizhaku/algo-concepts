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

}
