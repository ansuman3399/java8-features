package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, 2, 3, 9, 12, 67);
        Optional<Integer> limit = list.stream()
                .limit(2)
                .reduce((x, y) -> x + y);
        System.out.println(limit.isPresent() ? limit.get() : null);

        Optional<Integer> skip = list.stream()
                .skip(6)
                .reduce((x, y) -> x + y);
        System.out.println(skip.isPresent() ? skip.get() : null);
    }
}
