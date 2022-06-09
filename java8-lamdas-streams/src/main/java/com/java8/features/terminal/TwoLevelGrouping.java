package com.java8.features.terminal;

import com.java8.features.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoLevelGrouping {
    public static void main(String[] args) {
        Map<String, Map<String, List<StudentDatabase>>> collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(StudentDatabase::getName,
                        Collectors.groupingBy(studentDatabase -> studentDatabase.getBooks() > 10 ? "BAD" : "GOOD")));
        System.out.println(collect.toString());
    }
}
