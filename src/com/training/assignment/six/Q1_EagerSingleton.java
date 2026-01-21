package com.training.assignment.six;

public class Q1_EagerSingleton {
	private static final Q1_EagerSingleton INSTANCE = new Q1_EagerSingleton();

	private Q1_EagerSingleton() {
	}

	public static Q1_EagerSingleton getInstance() {
		return INSTANCE;
	}
}
