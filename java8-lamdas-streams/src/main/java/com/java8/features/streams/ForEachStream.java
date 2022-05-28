package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ansuman", "Dell", "Alexa", "UMBRELLA");
        list.stream().forEach(System.out::println);
    }
}
