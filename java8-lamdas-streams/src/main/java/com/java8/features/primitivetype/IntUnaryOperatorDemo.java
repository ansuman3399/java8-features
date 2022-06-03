package com.java8.features.primitivetype;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo {
    public static void main(String[] args) {
        IntUnaryOperator function = i -> i*i;
        System.out.println(function.applyAsInt(10));
    }
}
