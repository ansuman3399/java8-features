package com.java8.features.optional;

import java.util.Optional;

public class OptionalOfEmptyNullable {
    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable("String");
        System.out.println(string.get());

//        Optional<Object> obj = Optional.of(null);
//        System.out.println(obj.get());
    }
}
