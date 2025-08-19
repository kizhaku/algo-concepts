package com.learn.leetcode.dsa.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        StackImpl<Integer> stackOfInts = new StackImpl<>();
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.push(4);

        System.out.println("Peeking at the stack, I can see: " +stackOfInts.peek());
        printStack(stackOfInts);

        System.out.println("Popping item: " +stackOfInts.pop());
        System.out.println("Stack size is: " +stackOfInts.size());
        printStack(stackOfInts);
    }

    static <T> void printStack(StackImpl<T> stack) {
        System.out.println("Printing stack..");
        stack.print();
    }
}
