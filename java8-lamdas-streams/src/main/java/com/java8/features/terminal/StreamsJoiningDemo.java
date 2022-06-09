package com.java8.features.terminal;

import com.java8.features.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsJoiningDemo {
    public static void main(String[] args) {
        String collect = StudentDatabase.getAllStudents()
                .stream()
                .map(StudentDatabase::getName)
                .collect(Collectors.joining("-"));
        System.out.println(collect);
    }
}
