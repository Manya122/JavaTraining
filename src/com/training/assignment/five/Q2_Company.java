package com.training.assignment.five;

public class Q2_Company implements Runnable {

	private Q2_Account account;

	public Q2_Company(Q2_Account account) {
		this.account = account;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			account.addAmount(1000);

			try {
				Thread.sleep(1); // small delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
