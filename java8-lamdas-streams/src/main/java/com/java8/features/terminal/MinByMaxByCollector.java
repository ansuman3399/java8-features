package com.java8.features.terminal;

import com.java8.features.data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinByMaxByCollector {
    public static void main(String[] args) {
        Optional<StudentDatabase> collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(StudentDatabase::getBooks)));
        System.out.println(collect.isPresent() ? collect.get() : null);

        Optional<StudentDatabase> maxBooks = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(StudentDatabase::getBooks)));
        System.out.println(maxBooks.isPresent() ? maxBooks.get() : null);
    }
}
