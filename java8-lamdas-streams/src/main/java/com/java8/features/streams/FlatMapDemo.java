package com.java8.features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("list1a", "list2a", "list3a"));
        list.add(Arrays.asList("list1b", "list2b", "list3b"));
        list.add(Arrays.asList("list1c", "list2c", "list3c"));

//        list.stream().map(s->s.get(0)).collect(Collectors.toList());
//        list.stream().map(List::listIterator).collect(Collectors.toList());
        List<String> collect = list.stream().flatMap(List::stream).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
