package com.learn.leetcode.scribble;

class Parent {
    static void show() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}
public class Scribble3 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        Child.show();
    }
}

