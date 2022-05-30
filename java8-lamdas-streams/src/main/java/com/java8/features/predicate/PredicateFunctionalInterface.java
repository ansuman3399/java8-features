package com.java8.features.predicate;

import java.util.function.Predicate;

//predicate-predefined functional interface
//to check a particular conditional checking - java.util.function;
//functional interface
//only 1 method - boolean test(T t)
public class PredicateFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i > 10;
        System.out.println(predicate.test(11));
    }
}
