package com.java8.features.lambda;

public class Lambda {
    public static void main(String[] args) {
        Demo demo = str -> str.length();
        System.out.println(demo.stringLength("hiii"));
    }
}

@FunctionalInterface
interface Demo{
    public int stringLength(String str);

    default void m2(){

    }
    static void m3(){

    }
}