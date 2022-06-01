package com.java8.features.supplier;

import java.util.Date;
import java.util.function.Supplier;

//no input
//only returns R type
//R get();
//no default or static method
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Date> supplier = () -> new Date();
        System.out.println(supplier.get());
    }
}
