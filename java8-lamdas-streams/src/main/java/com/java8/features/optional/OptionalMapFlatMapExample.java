package com.java8.features.optional;

import com.java8.features.data.Bike;
import com.java8.features.data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void main(String[] args) {
        Optional<StudentDatabase> studentDatabase = Optional.of(StudentDatabase.record.get());
        studentDatabase.filter(student -> student.getBooks() >= 30)
                .ifPresent(student -> System.out.println(student.getName()));


        Optional<StudentDatabase> databaseOptional = Optional.of(StudentDatabase.record.get());
        databaseOptional.filter(student -> student.getBooks() > 10)
                .flatMap(StudentDatabase::getBike)
                .map(Bike::getName)
                .ifPresent(s -> System.out.println(s));
//        System.out.println();

    }
}
