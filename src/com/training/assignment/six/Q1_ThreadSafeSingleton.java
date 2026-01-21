package com.training.assignment.six;

public class Q1_ThreadSafeSingleton {
	private static Q1_ThreadSafeSingleton instance;

	private Q1_ThreadSafeSingleton() {
	}

	public static synchronized Q1_ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new Q1_ThreadSafeSingleton();
		}
		return instance;
	}
}
