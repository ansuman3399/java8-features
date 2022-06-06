package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstFindAny {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ansuman", "Ankit", "ans", "nana");
        Optional<String> a = list.stream().filter(s -> s.startsWith("A")).findAny();
        System.out.println(a.get());
    }
}
