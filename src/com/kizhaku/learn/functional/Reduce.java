package com.kizhaku.learn.functional;

import java.util.List;

public class Reduce {
    /**
     * Calculate sum of squares.
     * 1² + 2² + 3² + 4² + 5² = 55
     */

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Integer sumOfSquares = numbers.stream()
                .map(x -> x * x)
                .reduce(0, (a, b) -> a + b);

        Integer sumOfSquares_v2 = numbers.stream()
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        System.out.println(sumOfSquares);
        System.out.println(sumOfSquares_v2);
    }
}
