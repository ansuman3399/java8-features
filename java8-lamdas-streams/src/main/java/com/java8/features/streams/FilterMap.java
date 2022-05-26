package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMap {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,15,3,4,55,57,7,5,79,90);
        List<Integer> collect = list.stream()
                .filter(item -> item % 5 == 0)
                .map(val->val*2)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
