package com.java8.features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        tree.add(10);
        tree.add(1);
        tree.add(90);
        tree.add(2);
        tree.add(100);

        System.out.println(tree);
    }
}
