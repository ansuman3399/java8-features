package com.java8.features.java8Interface;

public class InterfaceMultipleInheritance implements Left,Right{
    public static void main(String[] args) {
        InterfaceMultipleInheritance test = new InterfaceMultipleInheritance();
        test.m1();
    }
    public void m1(){
//        System.out.println("new implementation");
        Left.super.m1();
    }
}

interface Left {
    default void m1() {
        System.out.println("Left m1");
    }
}

interface Right {
    default void m1() {
        System.out.println("Right m1");
    }
}
