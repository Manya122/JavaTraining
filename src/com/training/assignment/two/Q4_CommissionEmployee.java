package com.training.assignment.two;

public class Q4_CommissionEmployee extends Q4_Employee {

    private double sales;
    private double percent;

    public Q4_CommissionEmployee(String n, int id, double s, double p) {
        super(n, id);
        sales = s;
        percent = p;
    }

    public double getPayment() {
        return (percent * sales) / 100;
    }
}
