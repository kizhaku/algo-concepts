package com.kizhaku.learn.scribble;

import java.util.ArrayList;
import java.util.List;

public class Scribble4 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound("Kittu", "Ringo");

        foo();
    }

    static void foo() {
        List<String> fruits = List.of("apple", "orange", "banana", "mango", "plum");

        for (final String fruit : fruits) {
            System.out.println(fruit);
        }

        int x = 0;
        while (x < 5) {
            final int y = x + 1;
            System.out.println(y);
            x++;
        }

    }
}
