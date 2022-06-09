package com.java8.features.terminal;

import com.java8.features.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        Map<String, List<StudentDatabase>> collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(StudentDatabase::getCompany));
        System.out.println(collect.toString());


        Map<String, List<StudentDatabase>> good = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(studentDatabase -> studentDatabase.getBooks() > 10 ? "BAD" : "GOOD"));
        System.out.println(good);
    }
}
