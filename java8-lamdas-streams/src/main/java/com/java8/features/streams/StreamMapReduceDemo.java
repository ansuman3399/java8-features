package com.java8.features.streams;

import com.java8.features.data.StudentDatabase;

import java.util.List;

public class StreamMapReduceDemo {
    public static void main(String[] args) {
        List<StudentDatabase> allStudents = StudentDatabase.getAllStudents();
        Integer noOfBooks = allStudents.stream()
                .map(StudentDatabase::getBooks)
                .filter(i->i>=20)
                .reduce(0, Integer::sum);
        System.out.println(noOfBooks);
    }
}
