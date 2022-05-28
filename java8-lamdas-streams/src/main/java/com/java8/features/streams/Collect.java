package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ansuman","Dell","Alexa","UMBRELLA");
        List<String> collect = list.stream()
                .map(str -> str.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(list.stream().count());
        System.out.println(collect);
        /*Stream<String> stream = list.stream();
        Stream<String> stringStream = stream.filter(s -> s.length() > 9);
        List<String> collect1 = stringStream.collect(Collectors.toList());*/
    }
}
