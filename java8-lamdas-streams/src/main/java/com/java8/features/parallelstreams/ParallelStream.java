package com.java8.features.parallelstreams;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50)
                .parallel()
                .peek(value -> System.out.println(value))
                .sum();
        System.out.println(sum);
    }
}
