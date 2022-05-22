package com.java8.features.anonymousInnerClass;

public class InnerClassLambda {
    public static void main(String[] args) {
        Runnable r = ()-> System.out.println("Inner class lambda");
        Thread t = new Thread(r);
        t.start();
    }
}
