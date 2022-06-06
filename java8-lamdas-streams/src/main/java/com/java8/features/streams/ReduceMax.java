package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMax {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,7,2,3,9,12,67);
        Optional<Integer> reduce = list.stream()
                .reduce((a, b) -> a > b ? a : b);
        System.out.println(reduce.isPresent()?reduce.get():null);
    }
}
