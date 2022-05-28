package com.java8.features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultSorting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ansuman","Dell","Alexa","UMBRELLA");
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
//        Collections.sort(list);
//        System.out.println(list);
    }
}
