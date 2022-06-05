package com.java8.features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctDemo {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("list1a", "list2a", "list3a"));
        list.add(Arrays.asList("list1b", "list2b", "list3b"));
        list.add(Arrays.asList("list1c", "list2c", "list3c"));
        list.add(Arrays.asList("list1c", "list2c", "list3c"));

//        Stream<String> distinct =
        long count = list.stream().flatMap(List::stream).distinct().count();
        System.out.println(count);
    }
}
