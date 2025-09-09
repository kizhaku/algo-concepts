package com.learn.leetcode.dsa.queue;

public interface CustomQueue<T> extends Iterable<T> {
    void offer(T item);

    T poll();

    T peek();

    void print();

    boolean isEmpty();

    int size();
}
