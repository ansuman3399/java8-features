package com.java8.features.methodconstructorreference;

import java.util.function.Function;

public class FunctionFunctionalInterface {

    static Function<String, String> lamda = (s) -> s.toUpperCase();
    static Function<String,String> methodRef = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(lamda.apply("asd"));
        System.out.println(methodRef.apply("ansuman"));
    }
}
