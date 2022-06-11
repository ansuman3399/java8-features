package com.java8.features.datetimeapi;

import java.time.Year;

public class DateTimeAPI {
    public static void main(String[] args) {
        Year y = Year.of(2020);
        System.out.println(y.isLeap()?"true":"false");

    }
}
