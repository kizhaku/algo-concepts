package com.kizhaku.learn.dsa.stack;

public interface CustomStack<T> extends Iterable<T> {
    void push(T item);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
    void print();
}
