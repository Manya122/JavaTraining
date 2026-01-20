package com.training.assignment.two;

public class Q3_SavingsAccount extends Q3_Account{
	private final double interest = 5;
	private final double MIN_BAL = 5000;

	public Q3_SavingsAccount(String n, String acc, double bal) {
		super(n, acc, bal);
	}

	@Override
	public double getBalance() {
		return accountBalance + (accountBalance * interest / 100);
	}

	@Override
	public void withdraw(double amount) {

		if (amount > accountBalance) {
			System.out.println("Amount exceeds limit.");
			return;
		}

		if (accountBalance - amount < MIN_BAL) {
			System.out.println("Minimum balance must be 5000.");
			return;
		}

		accountBalance -= amount;
	}
}
