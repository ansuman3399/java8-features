package com.java8.features.function;

import java.util.function.Function;

//Function<T,R> where T is input type and R is return type.
//contains a default method R apply(T,R)
//It can return any type of value
public class FunctionFI {
    public static void main(String[] args) {
        Function<String,Integer> function = s->s.length();
        System.out.println(function.apply("abc"));
    }
}
