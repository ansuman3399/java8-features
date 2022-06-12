package com.java8.features.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {

    private String name;
    private String address;
    private String phoneNo;
    private String company;
    private int books;
    private Optional<Bike> bike = Optional.empty();

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "StudentDatabase{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", company='" + company + '\'' +
                ", books=" + books +
                ", bike=" + bike +
                '}';
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public StudentDatabase(String name, String address, String phoneNo, String company, int books) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.company = company;
        this.books = books;
    }

    public static List<StudentDatabase> getAllStudents() {
        List<StudentDatabase> studentlist = new ArrayList<>();
        studentlist.add(new StudentDatabase("a", "cut", "7873", "Del", 10));
        studentlist.add(new StudentDatabase("b", "bbsr", "7008", "DelIn", 20));
        studentlist.add(new StudentDatabase("c", "bb", "1234", "DelUs", 30));
        studentlist.add(new StudentDatabase("c", "bb", "1234", "DelUs", 30));
        return studentlist;
    }

    public static Supplier<StudentDatabase> record = () -> {
        Bike bike = new Bike("RE","Meteor");
        StudentDatabase student =  new StudentDatabase("c", "bb", "1234", "DelUs", 30 );
        student.setBike(Optional.ofNullable(bike));
        return student;
    };
}
