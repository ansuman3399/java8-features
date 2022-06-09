package com.java8.features.numericStreams;

import java.util.Arrays;
import java.util.List;

public class NumericStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
