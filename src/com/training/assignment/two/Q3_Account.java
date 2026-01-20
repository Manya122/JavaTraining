package com.training.assignment.two;

public class Q3_Account {
	protected String name;
	protected String accountNumber;
	protected double accountBalance;

	public Q3_Account(String name, String accountNumber, double accountBalance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public void deposit(double amount) {
		accountBalance += amount;
	}

	public void withdraw(double amount) {
		accountBalance -= amount;
	}

	public double getBalance() {
		return accountBalance;
	}
}
