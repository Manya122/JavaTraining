package com.training.assignment.five;

public class Q2_Account {
	private double balance;

	public Q2_Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	//UNSYNCHRONIZED VERSION (Race Condition)
	/*
	 * public void addAmount(double amount) { balance += amount; }
	 * 
	 * public void subtractAmount(double amount) { balance -= amount; }
	 */

	//SYNCHRONIZED VERSION (Correct)
	public synchronized void addAmount(double amount) {
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " deposited 1000, Balance: " + balance);
	}

	public synchronized void subtractAmount(double amount) {
		balance -= amount;
		System.out.println(Thread.currentThread().getName() + " withdrew 1000, Balance: " + balance);
	}
}
