package com.java8.features.biconsumer;

import java.util.function.BiConsumer;

public class BoConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (s1,s2)-> System.out.println(s1+" "+s2);
        biConsumer.accept("ansuman","mohanty");
    }
}
