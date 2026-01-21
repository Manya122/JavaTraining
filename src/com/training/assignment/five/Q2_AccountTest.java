package com.training.assignment.five;

public class Q2_AccountTest {
	public static void main(String[] args) {

		Q2_Account account = new Q2_Account(10000);

		Thread bankThread = new Thread(new Q2_Bank(account), "Bank-Thread");

		Thread companyThread = new Thread(new Q2_Company(account), "Company-Thread");

		bankThread.start();
		companyThread.start();

		try {
			bankThread.join();
			companyThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\nFinal Balance: " + account.getBalance());
	}
}
