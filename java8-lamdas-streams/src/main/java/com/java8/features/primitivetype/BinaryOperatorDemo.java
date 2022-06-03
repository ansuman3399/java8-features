package com.java8.features.primitivetype;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (s1,s2)->s1+s2;
        System.out.println(binaryOperator.apply("ansu ","mohanty"));
    }
}
