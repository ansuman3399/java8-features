package com.java8.features.bipredicate;

import java.util.function.BiPredicate;

public class BipredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) % 2 == 0;
        System.out.println(biPredicate.test(2,4));
    }
}
