package com.java8.features.parallelstreams;

import com.java8.features.data.StudentDatabase;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<String> companies = StudentDatabase.getAllStudents()
                .stream()
                .map(StudentDatabase::getCompany)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(companies);
    }

    static long checkPerformanceResult(Supplier<Integer> supplier, int noOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
