package com.learn.leetcode.dsa.stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackImpl<T> implements CustomStack<T>, Iterable<T> {

    /**
     *  Requirements
     *  ------------
     *  push(), element should be added to the back of stack.
     *  pop(), last element added in stack should be popped.
     *  peek(), able to see the last element added in stack.
     *  size(), get the number of elements in the stack.
     *  print(). print items of the stack.
     *
     *  -- Will use linked list to manage the stack.
     *  -- Each node will have the element to be added and a next pointer to the next element.
     */

    private int size;
    private StackNode<T> head;

    /**
     *  Head: A node which should always point to the last node added.
     *  if size = 0; head.next = null
     *  else newNode.next = head; head = newNode
     */
    public void push(T item) {
        head = (size == 0) ? new StackNode<>(item) : new StackNode<>(item, head);
        size++;
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();

        T poppedItem = head.getItem();
        head = head.getNext();
        size--;

        return poppedItem;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();

        return head.getItem();
    }

    public void print() {
        if (isEmpty()) System.out.println("[]");;

        Iterator<T> itr = iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            StackNode<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                if (currentNode == null) throw new NoSuchElementException("No further element in stack!");

                T item = currentNode.getItem();
                currentNode = currentNode.getNext();

                return item;
            }
        };
    }
}
