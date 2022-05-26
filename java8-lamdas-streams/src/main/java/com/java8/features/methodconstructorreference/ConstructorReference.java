package com.java8.features.methodconstructorreference;

public class ConstructorReference {

    ConstructorReference(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        In i = ConstructorReference::new;
        ConstructorReference constructorReference = i.get();
        System.out.println(constructorReference);
    }
}
interface In{
    ConstructorReference get();
}
