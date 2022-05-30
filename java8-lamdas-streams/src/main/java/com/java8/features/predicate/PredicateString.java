package com.java8.features.predicate;

import java.util.function.Predicate;

public class PredicateString {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.length()>5;
        System.out.println(predicate.test("ansu"));

        Predicate<String> pred2 = s -> s.startsWith("k")||s.startsWith("K");
        System.out.println(pred2.test("kans"));
    }
}
