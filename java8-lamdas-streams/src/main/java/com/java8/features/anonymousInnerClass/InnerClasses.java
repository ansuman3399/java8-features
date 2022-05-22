package com.java8.features.anonymousInnerClass;

public class InnerClasses {
    public static void main(String[] args) {
        Runnable r =new Runnable() {
            @Override
            public void run() {
                System.out.println("Inner class");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
