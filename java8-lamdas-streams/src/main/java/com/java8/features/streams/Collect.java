package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ansuman","Dell","Alexa","UMBRELLA");
        List<String> collect = list.stream()
                .map(str -> str.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
