package com.kizhaku.learn.dsa.stack;

public class StackNode<T> {

    private T item;
    private StackNode<T> next;

    public StackNode(T item, StackNode<T> next) {
        this.item = item;
        this.next = next;
    }

    public StackNode(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public StackNode<T> getNext() {
        return next;
    }
}
