package com.java8.features.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 0, 15, 5, 20));
        System.out.println(list);
        Collections.sort(list);

        //lambda expression implementing compare function
        /*Collections.sort(list, (i1, i2) -> {
            if (i1 > i2) {
                return -1;
            } else if (i1 == i2) {
                return 0;
            }
            return 1;
        });*/
        Collections.sort(list,(i1,i2)-> (i1>i2)?-1:(i1<i2)?1:0);
        System.out.println(list);
    }
}
