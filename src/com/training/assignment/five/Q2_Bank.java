package com.training.assignment.five;

public class Q2_Bank implements Runnable {

	private Q2_Account account;

	public Q2_Bank(Q2_Account account) {
		this.account = account;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			account.subtractAmount(1000);

			try {
				Thread.sleep(1); // small delay to increase race chance
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
