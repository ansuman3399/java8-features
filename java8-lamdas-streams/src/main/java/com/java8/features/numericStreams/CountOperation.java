package com.java8.features.numericStreams;

import com.java8.features.data.StudentDatabase;

import java.util.stream.Collectors;

public class CountOperation {
    public static void main(String[] args) {
        Long collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.counting());
        System.out.println(collect);
    }
}
