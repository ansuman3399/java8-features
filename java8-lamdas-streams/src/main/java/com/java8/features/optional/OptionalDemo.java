package com.java8.features.optional;

import com.java8.features.data.StudentDatabase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<List<StudentDatabase>> collect = Optional.ofNullable(StudentDatabase.getAllStudents()
                .stream()
                .filter(studentDatabase -> studentDatabase.getBooks() > 10)
                .collect(Collectors.toList()));
        System.out.println(collect.isPresent()?collect.get().stream().map(studentDatabase -> studentDatabase.getName()).collect(Collectors.toList()):null);
    }
}
