package com.java8.features.optional;

import com.java8.features.data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void main(String[] args) {
        Optional<StudentDatabase> studentDatabase = Optional.of(StudentDatabase.record.get());
        studentDatabase.filter(student -> student.getBooks() >= 30)
                .ifPresent(student -> System.out.println(student.getName()));
    }
}
