package com.java8.features.terminal;

import com.java8.features.data.StudentDatabase;

import java.util.stream.Collectors;

public class SummingIntAveragingInt {
    public static void main(String[] args) {
        Integer collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(StudentDatabase::getBooks));
        System.out.println(collect);

        Double collect1 = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(StudentDatabase::getBooks));
        System.out.println(collect1);
    }
}
