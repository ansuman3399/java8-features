package com.java8.features.primitivetype;

import java.util.function.LongUnaryOperator;

public class LongUnaryoperatorDemo {
    public static void main(String[] args) {
        LongUnaryOperator longFunction = l -> l*l;
        System.out.println(longFunction.applyAsLong(new Long(10)));
    }
}
