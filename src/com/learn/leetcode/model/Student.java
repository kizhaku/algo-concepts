package com.learn.leetcode.model;

public class Student {

    String name;
    String id;
    String course;

    public Student(String name, String id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }
}
