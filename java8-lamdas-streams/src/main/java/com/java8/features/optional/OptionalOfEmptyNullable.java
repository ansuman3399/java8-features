package com.java8.features.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOfEmptyNullable {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> {
            return null;
        };

        Optional<String> string = Optional.ofNullable("String");
        System.out.println(string.get());

//        Optional<Object> obj = Optional.of(null);
//        System.out.println(obj.get());

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> str = Optional.ofNullable(supplier.get());
        String value = str.isPresent() ? str.get() : str.orElse("Default");
        System.out.println("value:" + value);
    }
}
