package com.java8.features.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfIterateGenerateFactoryMethods {
    public static void main(String[] args) {
        //Of method
        Stream<String> of = Stream.of("a", "b", "c");
        of.forEach(System.out::println);

        //Iterate method
        Stream.iterate(1,x->x*2)
                .limit(10)
                .forEach(System.out::println);

        //Generate method
        Supplier<Integer> supplier  = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(4)
                .forEach(System.out::println);
    }
}
