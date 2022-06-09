package com.java8.features.numericStreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class NumericStreamAggregate {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println(sum);

        boolean present = IntStream.rangeClosed(1, 50).max().isPresent();
        System.out.println(present);

        OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        System.out.println(average.isPresent()?average.getAsDouble():null);
    }
}
