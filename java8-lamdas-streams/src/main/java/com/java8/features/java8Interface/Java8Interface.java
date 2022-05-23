package com.java8.features.java8Interface;

public class Java8Interface implements Interf {
    public static void main(String[] args) {
        Java8Interface in = new Java8Interface();
        in.m1();
        in.m2();
    }

    @Override
    public void m1() {
        System.out.println("m1 Implementation");
    }

    @Override
    public void m2() {
        System.out.println("override m2");
    }
}

interface Interf {
    void m1();

    default void m2() {
        System.out.println("interface default");
    }
}
