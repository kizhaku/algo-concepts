package com.learn.leetcode.dsa.queue;

import java.util.Queue;

public class QueueNode<T> {
    private final T item;
    private QueueNode<T> next;

    public QueueNode(T item, QueueNode<T> next) {
        this.item = item;
        this.next = next;
    }

    public T getItem() {
        return item;
    }

    public QueueNode<T> getNext() {
        return next;
    }

    public void setNext(QueueNode<T> next) {
        this.next = next;
    }
}
