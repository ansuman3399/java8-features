package com.java8.features.multipleInheritance;

public class Client implements Interface1,Interface2,Interface3{

    public void methodA(){
        System.out.println("inside client");
    }
    public static void main(String[] args) {
        Client client = new Client();
        client.methodA();
        client.methodB();
        client.methodC();
    }
}
 