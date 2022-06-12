package com.java8.features.multipleInheritance;

public interface Interface1 {

    default void methodA() {
        System.out.println("method A:" + Interface1.class);
    }
}
