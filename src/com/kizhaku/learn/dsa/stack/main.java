package com.kizhaku.learn.dsa.stack;

public class main {

    public static void main(String[] args) {
        CustomStack<Integer> stackOfInts = new StackImpl<>();
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.push(4);

        System.out.println("Peeking at the stack, I can see: " +stackOfInts.peek());
        printStack(stackOfInts);

        System.out.println("Popping item: " +stackOfInts.pop());
        System.out.println("Stack size is: " +stackOfInts.size());
        printStack(stackOfInts);

        System.out.println("Looping..");
        for (Integer item : stackOfInts) {
            System.out.println(item);
        }
    }

    static <T> void printStack(CustomStack<T> stack) {
        System.out.println("Printing stack..");
        stack.print();
    }
}
