package com.java8.features.data;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

    String name;
    String address;
    String phoneNo;
    String company;
    int books;

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "StudentDatabase{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", company='" + company + '\'' +
                '}';
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

    public StudentDatabase(String name, String address, String phoneNo, String company , int books) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.company = company;
        this.books=books;
    }

    public static List<StudentDatabase> getAllStudents() {
        List<StudentDatabase> studentlist = new ArrayList<>();
        studentlist.add(new StudentDatabase("a", "cut", "7873", "Del",10));
        studentlist.add(new StudentDatabase("b", "bbsr", "7008", "DelIn",20));
        studentlist.add(new StudentDatabase("c", "bb", "1234", "DelUs",30));
        return studentlist;
    }
}
