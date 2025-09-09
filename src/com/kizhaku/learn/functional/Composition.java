package com.learn.leetcode.functional;

import java.util.concurrent.Callable;
import java.util.function.*;

public class Composition {

    public static void main(String[] args) {
        UnaryOperator<Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> addThree = x -> x + 3;

        //Composition
        Function<Integer, Integer> compose = multiplyBy2.compose(addThree);

        //AndThen
        Function<Integer, Integer> andThen = multiplyBy2.andThen(addThree);

        System.out.println(compose.apply(2)); //10
        System.out.println(andThen.apply(2)); //7
    }
}
