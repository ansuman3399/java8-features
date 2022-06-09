package com.java8.features.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToObjDemo {
    public static void main(String[] args) {

        List<Integer> collect = IntStream.rangeClosed(1, 50)
                .mapToObj((i) -> new Integer(i))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
