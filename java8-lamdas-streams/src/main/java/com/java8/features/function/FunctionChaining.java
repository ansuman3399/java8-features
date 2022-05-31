package com.java8.features.function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String,String> upper = s -> s.toUpperCase();
        Function<String,String> substring = s -> s.substring(0,9);
        System.out.println(upper.apply("cillianmurphy"));
        System.out.println(substring.apply("cillianmurphy"));
        System.out.println(upper.andThen(substring).apply("cillianmurphy"));
        System.out.println(upper.compose(substring).apply("cillianmurphy"));
    }
}
