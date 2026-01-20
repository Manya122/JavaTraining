package com.training.assignment.two;

public class Q3_CurrentAccount extends Q3_Account {

    private double overdraft = 2000;
    private String tradeLicenseNumber;

    public Q3_CurrentAccount(String n, String acc, double bal, String license) {
        super(n, acc, bal);
        this.tradeLicenseNumber = license;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= accountBalance + overdraft) {
            accountBalance -= amount;
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}