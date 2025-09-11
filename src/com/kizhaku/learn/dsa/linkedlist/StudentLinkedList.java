package com.kizhaku.learn.dsa.linkedlist;

import com.kizhaku.learn.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentLinkedList {
    private StudentNode head;
    private int size = 0;

    public void add(Student student) {
        head = size == 0 ? new StudentNode(student, null) : new StudentNode(student, head);
        size++;
    }

    public List<Student> getAllNodes() throws IllegalAccessException {
        List<Student> allNodes = new ArrayList<>();
        StudentNode nextNode = head;

        if (size == 0)
            throw new IllegalAccessException("StudentLinkedList is empty");

        for (int i = 0; i < size; i++) {
            allNodes.add(nextNode.getStudent());
            nextNode = nextNode.getNextNode();
        }

        return allNodes;
    }

    public int getSize() {
        return size;
    }
}
