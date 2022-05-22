package com.java8.features.anonymousInnerClass;

public class InnerClassLambda {
    public static void main(String[] args) {
        Runnable r = ()-> System.out.println("Inner class lambda");
        Thread t = new Thread(r);
        t.start();

        //passing inside the thread method
        Thread thread = new Thread(()->{
            System.out.println("Inside lambda inner class");
        });
        thread.start();
    }
}
