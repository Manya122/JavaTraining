package com.training.assignment.two;

import java.util.ArrayList;

public class Q5_PaymentApp {

    public static void main(String[] args) {

        ArrayList<Q5_Payable> list = new ArrayList<>();

        list.add(new Q5_Invoice("I1",5,100));
        list.add(new Q5_Invoice("I2",2,300));

        for(Q5_Payable p : list){
            System.out.println("Payment: " + p.getPayment());
        }
    }
}
