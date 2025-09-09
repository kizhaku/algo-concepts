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
            TreeNode<T> node = new TreeNode<>(item, null, null, null);
            root = node;
        } else {
            findPlace(root, item, null);
        }

        size++;
    }

    void findPlace(TreeNode<T> node, T item, TreeNode<T> parent) {
        TreeNode<T> traversePath = node;

        if (node != null) {
            if (item.compareTo(traversePath.getItem()) > 0) {
                if (traversePath.getRight() != null) {
                    findPlace(traversePath.getRight(), item, traversePath);
                } else {
                    //Insert
                    traversePath.setRight(new TreeNode<>(item, null, null, parent));
                }
            } else {
                if (traversePath.getLeft() != null) {
                    findPlace(traversePath.getLeft(), item, traversePath);
                } else {
                    //Insert
                    traversePath.setLeft(new TreeNode<>(item, null, null, parent));
                }
            }
        }
    }

    void print() {
       TreeNode<T> curNode = this.root;

       while (curNode.getItem() != null) {
            if (curNode.getLeft() != null) {
                curNode = curNode.getLeft();
                continue;
            } else {
                System.out.println(curNode.getItem());
                System.out.println(curNode.getParent().getItem());
            }
       }
    }

}
