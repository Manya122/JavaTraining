package com.training.assignment.two;

public class Q4_HourlyEmployee extends Q4_Employee {

    private double hours;
    private double rate;

    public Q4_HourlyEmployee(String n, int id, double h, double r) {
        super(n, id);
        hours = h;
        rate = r;
    }

    public double getPayment() {
        return hours * rate;
    }
}
