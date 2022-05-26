package com.java8.features.methodconstructorreference;
//1) Reference to a Static Method
public class StaticMethodReference {
    static void m2(){
        System.out.println("m2 reference");
    }

    public static void main(String[] args) {
        Ref ref = StaticMethodReference::m2;
        ref.m1();
    }
}
interface Ref{
    void m1();
}
