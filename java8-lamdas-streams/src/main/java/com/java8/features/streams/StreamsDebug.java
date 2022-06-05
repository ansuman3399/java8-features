package com.java8.features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDebug {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ansu", "Don", "SRK");
        List<String> a = list.stream()
//                .peek(s -> System.out.println(s))
                .filter(s -> s.length() >= 3)
                .peek(s -> System.out.println("After first filter" + s))
                .filter(s -> s.startsWith("A"))
                .peek(s -> System.out.println("After 2nd filter" + s))
                .collect(Collectors.toList());
        System.out.println(a);
    }
}
