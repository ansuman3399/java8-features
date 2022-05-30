package com.java8.features.predicate;

import java.util.function.Predicate;

//Predicate joining:
//p1.negate()  --- checks the reverse condition
//p1.and(p2)  --both the conditions needs to be satisfied
//p1.or(p2)  ---- any one of the condition needs to be satisfied
public class PredicateJoining {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("Numbers greater than 10:");
        execute(p1, x);
        System.out.println("Even Numbers :");
        execute(p2, x);
        System.out.println("Numbers NOT greater than 10:");
        execute(p1.negate(), x);
        System.out.println("Numbers greater than 10 and even numbers:");
        execute(p1.and(p2), x);
        System.out.println("Numbers greater than 10 OR even number:");
        execute(p1.or(p2), x);
    }

    public static void execute(Predicate<Integer> p, int[] x) {
        for (Integer i : x) {
            System.out.println(i + ":" + p.test(i));
        }
    }
}
