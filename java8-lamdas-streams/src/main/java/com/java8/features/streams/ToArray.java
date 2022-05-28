package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 10, 20, 5, 6, 15);
        Integer[] integers = list.stream().sorted().toArray(Integer[]::new);
        for (Integer i : integers) {
            System.out.println(i);
        }
    }
}
