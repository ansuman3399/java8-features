package com.java8.features.streams;

import com.java8.features.data.StudentDatabase;

import java.util.List;

public class StreamMapReduceDemo {
    public static void main(String[] args) {
        List<StudentDatabase> allStudents = StudentDatabase.getAllStudents();
        Integer noOfBooks = allStudents.stream()
                .map(StudentDatabase::getBooks)
                .reduce(0, (a, b) -> a + b);
        System.out.println(noOfBooks);
    }
}
