package com.learn.leetcode.dsa.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueImpl<T> implements CustomQueue<T> {

    /**
     *  Requirement:
     *  offer() - Add new item to end of the queue.
     *  poll() - Pull the first item in the queue.
     *  peek() - View the first item in the queue
     *
     *  Implement:
     *  Will use a linked list to implement the queue.
     */

    int size;
    private QueueNode<T> head;
    private QueueNode<T> tail;

    @Override
    public void offer(T item) {
        if (size == 0) {
            head = new QueueNode<>(item, head);
            tail = head;
        }
        else {
            tail.setNext(new QueueNode<>(item, null));
            tail = tail.getNext();
        }
        size++;
    }

    @Override
    public T poll() {
        if (isEmpty()) throw new NoSuchElementException();

        T item = head.getItem();
        head = head.getNext();
        size--;

        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new NoSuchElementException();
        return head.getItem();
    }

    @Override
    public void print() {
        for (T t : this) {
            System.out.println(t);
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            QueueNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();

                T item = current.getItem();
                current = current.getNext();

                return item;
            }
        };
    }
}
