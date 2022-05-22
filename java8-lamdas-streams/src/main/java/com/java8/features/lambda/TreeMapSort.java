package com.java8.features.lambda;

import java.util.TreeMap;

public class TreeMapSort {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        map.put(1,"java");
        map.put(2,"python");
        System.out.println(map);
    }
}
