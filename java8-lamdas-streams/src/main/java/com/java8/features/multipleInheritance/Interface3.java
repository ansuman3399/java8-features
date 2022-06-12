package com.java8.features.multipleInheritance;

public interface Interface3 extends Interface2{

    default void methodC(){
        System.out.println("method C");
    }
}
