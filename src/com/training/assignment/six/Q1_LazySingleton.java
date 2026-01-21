package com.training.assignment.six;

public class Q1_LazySingleton {
	private static Q1_LazySingleton instance;

	private Q1_LazySingleton() {
	}

	public static Q1_LazySingleton getInstance() {
		if (instance == null) {
			instance = new Q1_LazySingleton(); // ❌ race condition
		}
		return instance;
	}
}
