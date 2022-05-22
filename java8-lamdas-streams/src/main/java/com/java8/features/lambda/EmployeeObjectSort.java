package com.java8.features.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeObjectSort {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ansu"));
        list.add(new Employee(3, "abc"));
        list.add(new Employee(2, "xyz"));
        list.add(new Employee(8, "Ansuman"));

        Collections.sort(list, (e1, e2) -> (e1.getId()>e2.getId())?-1:e1.getId()<e2.getId()?1:0);
        System.out.println(list.toString());
    }
}

class Employee {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
