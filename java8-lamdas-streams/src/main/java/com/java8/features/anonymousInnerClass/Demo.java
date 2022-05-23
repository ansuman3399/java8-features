package com.java8.features.anonymousInnerClass;

interface Age {
    int x = 21;

    void getAge();
}

// Main class
class Demo {

    // Main driver method
    public static void main(String[] args) {

        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age oj1 = new Age() {

            @Override
            public void getAge() {
                // printing  age
                System.out.println("Age is " + x);
            }
        };

        oj1.getAge();
        System.out.println(Age.x);
    }
}