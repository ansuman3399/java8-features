package com.java8.features.consumer;

import java.util.function.Consumer;

//interface consumer
//tells to only consume a value
//void accept(T t);
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("hi");
    }
}
