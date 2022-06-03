package com.java8.features.primitivetype;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorDemo {
    public static void main(String[] args) {
        IntBinaryOperator operator = (i1, i2) -> i1 * i2;
        System.out.println(operator.applyAsInt(10, 20));
    }
}
