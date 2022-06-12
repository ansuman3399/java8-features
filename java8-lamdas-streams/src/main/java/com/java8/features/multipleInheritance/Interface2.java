package com.java8.features.multipleInheritance;

public interface Interface2 extends Interface1 {
    default void methodB(){
        System.out.println("method B");
    }

    default void methodA(){
        System.out.println("method A:"+Interface2.class);//resolve to child implementation
    }
}
