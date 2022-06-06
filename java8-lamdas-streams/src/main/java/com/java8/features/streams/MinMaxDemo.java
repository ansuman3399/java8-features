package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;

public class MinMaxDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,7,2,3,9,12,67);

        Integer min = list.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println("Min value:"+min);

        Integer max = list.stream().min((a, b) -> -a.compareTo(b)).get();
        System.out.println("Max value:"+max);
    }
}
