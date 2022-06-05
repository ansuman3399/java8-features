package com.java8.features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorComparing {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("list1a");
        list.add("list1b");
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
