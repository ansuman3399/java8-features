package com.java8.features.primitivetype;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {
    public static void main(String[] args) {
        ToIntFunction<String> intFunction = s -> s.length();
        System.out.println(intFunction.applyAsInt("Ansuman"));
    }
}
