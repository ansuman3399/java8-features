package com.java8.features.function;

import java.util.ArrayList;
import java.util.function.Function;

public class GradeFunction {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        populate(list);

        Function<Student, String> function = student -> {
            int marks = student.marks;
            if (marks >= 80)
                return "A";
            else if (marks >= 60)
                return "B";
            else if (marks >= 50)
                return "C";
            else
                return "Fail";
        };

        System.out.println(function.apply(new Student("Ansuman", 30)));
    }

    public static void populate(ArrayList<Student> list) {
        list.add(new Student("Ansuman", 33));
        list.add(new Student("Ansu", 31));
        list.add(new Student("abc", 99));
        list.add(new Student("xyz", 51));

    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
