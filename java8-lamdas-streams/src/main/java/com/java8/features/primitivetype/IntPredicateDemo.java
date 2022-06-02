package com.java8.features.primitivetype;

import java.util.function.IntPredicate;

public class IntPredicateDemo {
    public static void main(String[] args) {
        IntPredicate pred = i -> i % 2 == 0;
        System.out.println(pred.test(4));
    }
}
