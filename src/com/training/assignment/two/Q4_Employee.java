package com.training.assignment.two;

public abstract class Q4_Employee implements Q5_Payable {

    protected String name;
    protected int employeeId;

    public Q4_Employee(String n, int id) {
        name = n;
        employeeId = id;
    }

    public abstract double getPayment();
}
