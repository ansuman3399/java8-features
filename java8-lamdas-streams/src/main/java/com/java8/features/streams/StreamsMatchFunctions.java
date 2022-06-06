package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsMatchFunctions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ansu", "tana", "annie");
        boolean match = list.stream().noneMatch(s -> s.startsWith("c"));
        System.out.println(match);
    }
}
