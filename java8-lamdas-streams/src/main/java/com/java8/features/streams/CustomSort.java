package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ansuman", "Dell", "Alexa", "UMBRELLA");
        System.out.println(list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList()));
    }
}
