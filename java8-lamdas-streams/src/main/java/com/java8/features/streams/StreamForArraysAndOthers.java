package com.java8.features.streams;

import java.util.stream.Stream;

public class StreamForArraysAndOthers {
    public static void main(String[] args) {
//        String[] str = new String[]{"ab","bc","ca"};
//        Stream.of(str).forEach(st-> System.out.println(st));
        String s = "this is a sample text";
        Stream.of(s.split(" ")).forEach(st-> System.out.println(st));
    }
}
