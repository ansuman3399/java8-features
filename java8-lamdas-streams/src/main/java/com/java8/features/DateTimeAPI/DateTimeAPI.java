package com.java8.features.DateTimeAPI;

import java.time.Year;
import java.time.ZoneId;

public class DateTimeAPI {
    public static void main(String[] args) {
        Year y = Year.of(2020);
        System.out.println(y.isLeap()?"true":"false");

    }
}
