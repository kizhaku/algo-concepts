package com.learn.leetcode.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TransformList {

    public static void main(String[] args) {
        Function<Integer, Integer> squareNums = x -> x * x;
        List<Integer> listOfNums = Arrays.asList(1, 2, 3, 4, 5, 6);


        transformList(listOfNums, squareNums)
                .forEach(System.out::println);
    }

    static List<Integer> transformList(List<Integer> list, Function<Integer, Integer> func) {
        return list.stream()
                .map(func)
                .toList();
    }
}
