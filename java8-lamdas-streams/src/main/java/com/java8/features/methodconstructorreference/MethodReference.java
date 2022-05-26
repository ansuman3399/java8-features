package com.java8.features.methodconstructorreference;

public class MethodReference {
    static void m2(){
        System.out.println("m2 reference");
    }

    public static void main(String[] args) {
        Ref ref = MethodReference::m2;
        ref.m1();
    }
}
interface Ref{
    void m1();
}
