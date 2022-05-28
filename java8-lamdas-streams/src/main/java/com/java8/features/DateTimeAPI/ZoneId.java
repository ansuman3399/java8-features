package com.java8.features.DateTimeAPI;

import java.time.*;

public class ZoneId {
    public static void main(String[] args) {

//        ZoneId zone = ZoneId.of("America/Los_Angeles");
//        ZonedDateTime zd = ZonedDateTime.now(zone);
//        System.out.println(zd);
        System.out.println(java.time.ZoneId.systemDefault());
    }
}
