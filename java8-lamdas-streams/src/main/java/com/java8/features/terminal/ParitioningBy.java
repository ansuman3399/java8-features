package com.java8.features.terminal;

import com.java8.features.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ParitioningBy {
    public static void main(String[] args) {
        Predicate<StudentDatabase> booksPredicate = studentDatabase -> studentDatabase.getBooks() > 10;
        Map<Boolean, List<StudentDatabase>> booksPartition = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(booksPredicate));
        System.out.println(booksPartition);

        //partitioning by using downstream
        Map<Boolean, Set<StudentDatabase>> setMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(booksPredicate, Collectors.toSet()));
        System.out.println(setMap);
    }
}
