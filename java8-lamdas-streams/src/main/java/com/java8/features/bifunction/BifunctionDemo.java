package com.java8.features.bifunction;

import java.util.function.BiFunction;

public class BifunctionDemo {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (s1, s2) -> {
            return s1 + " " + s2;
        };
        System.out.println(biFunction.apply("ansu","mohanty"));
    }
}
