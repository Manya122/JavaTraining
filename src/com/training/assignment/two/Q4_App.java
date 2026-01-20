package com.training.assignment.two;

import java.util.ArrayList;

public class Q4_App {

    public static void main(String[] args) {

        ArrayList<Q4_Employee> list = new ArrayList<>();

        list.add(new Q4_SalariedEmployee("A",1,5000));
        list.add(new Q4_HourlyEmployee("B",2,40,100));
        list.add(new Q4_CommissionEmployee("C",3,20000,10));

        for (Q4_Employee e : list) {
            System.out.println(e.getPayment());
        }
    }
}
