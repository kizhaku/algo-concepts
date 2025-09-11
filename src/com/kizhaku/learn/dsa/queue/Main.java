package com.kizhaku.learn.dsa.queue;

public class Main {

    public static void main(String[] args) {
        QueueImpl<Integer> queue = new QueueImpl<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        printQueue(queue);
        System.out.println("Polling queue. Item will be: " +queue.peek());
        queue.poll();
        printQueue(queue);
    }

    static <T> void printQueue(QueueImpl<T> queue) {
        System.out.println("Printing queue");
        queue.print();
    }
}
