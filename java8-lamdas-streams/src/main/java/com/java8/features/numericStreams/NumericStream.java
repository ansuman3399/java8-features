package com.java8.features.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = list.stream().reduce(0, (a, b) -> a + b); //unboxing to convert Integer to int and then to Integer
        System.out.println(sum);

        int sum1 = IntStream.rangeClosed(1, 9).sum();
        System.out.println(sum1);

        IntStream.rangeClosed(1,50).forEach(System.out::println);
        IntStream.range(1,50).forEach(System.out::println);
    }
}
