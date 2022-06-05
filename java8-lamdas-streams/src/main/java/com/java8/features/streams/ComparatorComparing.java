package com.java8.features.streams;

import com.java8.features.data.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorComparing {
    public static void main(String[] args) {
        List<StudentDatabase> list = StudentDatabase.getAllStudents();
        List<StudentDatabase> collect = list.stream()
                .sorted(Comparator.comparing(StudentDatabase::getAddress))
                .collect(Collectors.toList());
        System.out.println(collect.toString());

    }
}
