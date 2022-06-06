package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

//reduce the content of the stream
public class ReduceOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 7);
        Integer reduce = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce);
    }
}
