package com.java8.features.numericStreams;

import com.java8.features.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        Set<String> collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(StudentDatabase::getName, Collectors.toSet()));
        System.out.println(collect);
    }
}
