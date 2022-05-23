package com.java8.features.java8Interface;

public class StaticMethodInterface {
    public static void main(String[] args) {
        Inter.m1();
    }
}
interface Inter{
    public static void m1(){
        System.out.println("static method");
    }
}