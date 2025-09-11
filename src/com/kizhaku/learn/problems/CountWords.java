package com.kizhaku.learn.problems;

public class CountWords {

    public static void main(String[] args) {
        String str = "This is string, with some words";

        System.out.println("Word count: " +str.split("\\s").length);
    }
}
