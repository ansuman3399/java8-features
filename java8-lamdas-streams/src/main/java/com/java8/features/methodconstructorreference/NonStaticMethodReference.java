package com.java8.features.methodconstructorreference;
//1) Reference to a non Static Method
public class NonStaticMethodReference {
    void m1(){
        System.out.println("m1 inside class");
    }

    public static void main(String[] args) {
        NonStaticMethodReference obj = new NonStaticMethodReference();
        Interf ref = obj::m1;
        ref.m2();
    }
}
interface Interf{
    void m2();
}