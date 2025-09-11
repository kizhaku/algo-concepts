package com.kizhaku.learn.dsa;

import com.kizhaku.learn.model.Student;

import java.util.*;

public class Queues {

    public static void main(String[] args) {
        stack();
        //queue();
        //priorityQueueDefault();
        priorityQueueCustom();
    }

    static void stack() {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Hello");
        stack.push("World");

        printStack(stack);
    }

    static void queue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Hello");
        queue.add("World");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    /**
     *  While polling sorts data based on natural order.
     *  A custom comparator can be passed.
     */
    static void priorityQueueDefault() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Bangaluru");
        queue.add("Kannur");
        queue.add("Alighad");

        printQueue(queue);
    }

    static void priorityQueueCustom() {
        Comparator<Student> compare = (s1, s2) -> {
            return s1.getName().compareTo(s2.getName());
        };
        Comparator<Student> compareMethodRef = (Comparator.comparing(Student::getName));

        Queue<Student> studentQueue = new PriorityQueue<>(compare);
        studentQueue.addAll(getStudentList());
        printQueue(studentQueue);
    }

    static List<Student> getStudentList() {
        return List.of(new Student("Kittu", "1", "Catology"),
                new Student("Ringo", "2", "Dogology"),
                new Student("Anand", "3", "Elephantology"));
    }

    static <T> void printQueue(Queue<T> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    static <T extends Deque<?>> void printStack(T stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
