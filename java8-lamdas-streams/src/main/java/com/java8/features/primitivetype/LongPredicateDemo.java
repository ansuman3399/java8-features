package com.java8.features.primitivetype;

import java.util.function.LongPredicate;

public class LongPredicateDemo {
    public static void main(String[] args) {
        LongPredicate pred = i -> i % 2 == 0;
        System.out.println(pred.test(new Long(6)));
    }
}
