package com.learn.leetcode.functional;

import java.util.function.Function;

public class Pipeline {

    public static void main(String[] args) {
        Function<String, String> sanitize = String::trim;
        Function<String, String> validate = s -> {
            if (s.isEmpty()) throw new IllegalArgumentException("Empty input");
            return s;
        };
        Function<String, String> process = s -> "Processed: " + s;

        Function<String, String> pipeline = sanitize
                                            .andThen(validate)
                                            .andThen(process);

        System.out.println(pipeline.apply(" Hello"));
    }
}
