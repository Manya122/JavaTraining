package com.training.assignment.two;

public class Q5_Invoice implements Q5_Payable {

    private String invoiceId;
    private int quantity;
    private double pricePerUnit;

    public Q5_Invoice(String id,int q,double p){
        invoiceId=id;
        quantity=q;
        pricePerUnit=p;
    }

    public double getPayment(){
        return quantity * pricePerUnit;
    }
}
