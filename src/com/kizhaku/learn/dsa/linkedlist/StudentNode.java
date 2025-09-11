package com.kizhaku.learn.dsa.linkedlist;

import com.kizhaku.learn.model.Student;

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
