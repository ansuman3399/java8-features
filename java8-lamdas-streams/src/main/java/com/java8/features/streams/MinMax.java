package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 20, 5, 190, 1);
        Integer integer = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(integer);
    }
}
