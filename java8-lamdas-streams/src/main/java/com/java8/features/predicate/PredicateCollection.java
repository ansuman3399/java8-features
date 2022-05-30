package com.java8.features.predicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateCollection {
    public static void main(String[] args) {
        Predicate<Collection> predicate = collection -> collection.isEmpty();
        System.out.println(predicate.test(Arrays.asList()));
    }
}
