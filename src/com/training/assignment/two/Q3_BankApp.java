package com.training.assignment.two;

public class Q3_BankApp {
	public static void main(String[] args) {

        Q3_SavingsAccount s =
            new Q3_SavingsAccount("Manya", "S101", 10000);

        Q3_CurrentAccount c =
            new Q3_CurrentAccount("Shop", "C101", 2000, "LIC123");

        s.withdraw(4000);
        System.out.println("Savings balance: " + s.getBalance());

        c.withdraw(3500);
        System.out.println("Current balance: " + c.getBalance());
    }
}
