package com.training.assignment.three;

import java.io.Serializable;

public class Q3_Employee implements Serializable {

    private int id;
    private String name;
    private Q3_Address address;

    // non-serializable field
    private transient double salary;

    public Q3_Employee(int id, String name,
                       Q3_Address address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}
