package com.training.assignment.two;

public class Q4_SalariedEmployee extends Q4_Employee {

    private double weeklySalary;

    public Q4_SalariedEmployee(String n, int id, double sal) {
        super(n, id);
        weeklySalary = sal;
    }

    public double getPayment() {
        return weeklySalary;
    }
}
