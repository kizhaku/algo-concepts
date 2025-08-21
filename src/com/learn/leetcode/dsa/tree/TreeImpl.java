package com.learn.leetcode.dsa.tree;

public class TreeImpl<T extends Integer> {

    //In progress..

    /**
     *  Requirements:
     *  add() - Add an element to the tree based on natural ordering.
     *  remove() - Removes an element from the tree.
     *
     *  Constraints:
     *  - Will keep the tree for integer type for time being.
     */

    TreeNode<T> root;
    int size;

    public void add(T item) {
        if (size == 0) {
            TreeNode<T> node = new TreeNode<>(item, null, null);
            root = node;
        } else {
            findPlace(root, item);
        }

        size++;
    }

    void findPlace(TreeNode<T> node, T item) {
        TreeNode<T> traversePath = node;

        if (node != null) {
            if (item.compareTo(traversePath.getItem()) > 0) {
                if (traversePath.getRight() != null) {
                    findPlace(traversePath.getRight(), item);
                } else {
                    //Insert
                    traversePath.setRight(new TreeNode<>(item, null, null));
                }
            } else {
                if (traversePath.getLeft() != null) {
                    findPlace(traversePath.getLeft(), item);
                } else {
                    //Insert
                    traversePath.setLeft(new TreeNode<>(item, null, null));
                }
            }
        }
    }

    void print() {
        TreeNode<T> startNode = root;
        System.out.println(root.getItem());
        System.out.println(root.getLeft().getItem());
        System.out.println(root.getRight().getItem());

        if (startNode.getItem() == null) {
            return;
        } else {
            System.out.println(startNode.getItem());
        }

        while (startNode.getLeft() != null || startNode.getRight() != null) {
            if (startNode.getLeft() != null) {
                System.out.println(startNode);
            }
        }
    }

    void printTree(TreeNode<T> left, TreeNode<T> right) {
        if(left != null) {
            System.out.println(left.getItem());

            if (left.getLeft() != null) {
                left = left.getLeft();
            }
        }

        if (right != null) {
            System.out.println(right.getItem());

        }

        if (left.getLeft() != null) {
        }
    }
}
