package com.kizhaku.learn.problems;

/**
 * Middle Node
 *
 * Write a function that takes in the head of a singly linked list and returns the middle node of the linked list.
 *
 * If the linked list has an even number of nodes, return the second of the two middle nodes.
 *
 * Each LinkedList node has an integer value and a next node pointing to the next node in the list (or null if it’s the last node).
 *
 * Sample Input
 * linkedList = 2 → 7 → 3 → 5 → null
 *
 * Sample Output
 * 3 → 5 → null
 *
 * Explanation
 *
 * The middle node of the list is the node with value 3. The function should return this node, not just its value.
 */

public class MiddleNode {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList middleNode(LinkedList linkedList) {
        int size = getsize(linkedList);
        int middle = (size / 2) + 1;
        LinkedList middleNode = linkedList;

        for (int i = 0; i < middle; i++) {
            middleNode = linkedList.next;
        }

        // Write your code here.
        return middleNode;
    }

    public int getsize(LinkedList linkedList) {
        int size = 0;

        while (linkedList.next != null) {
            size++;
            getsize(linkedList.next);
        }

        return size;
    }

}
