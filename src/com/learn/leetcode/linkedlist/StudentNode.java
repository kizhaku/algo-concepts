package com.learn.leetcode.linkedlist;

import com.learn.leetcode.model.Student;

class StudentNode {

    Student student;
    StudentNode nextNode;

    public StudentNode(Student student, StudentNode nextNode) {
        this.student = student;
        this.nextNode = nextNode;
    }

    public Student getStudent() {
        return student;
    }

    public StudentNode getNextNode() {
        return nextNode;
    }
}
