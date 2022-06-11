package com.java8.features.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.rangeClosed(1, 50)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect.parallelStream().reduce(0,(a,b)->a+b));
    }
}
