package com.java8.features.terminal;

import com.java8.features.data.StudentDatabase;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeLevelGroupingBy {
    public static void main(String[] args) {
        LinkedHashMap<String, Set<StudentDatabase>> collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        StudentDatabase::getName,
                        LinkedHashMap::new,
                        Collectors.toSet()
                ));
        System.out.println(collect);
    }
}
