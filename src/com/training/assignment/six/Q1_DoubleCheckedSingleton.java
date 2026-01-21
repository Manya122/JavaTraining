package com.training.assignment.six;

public class Q1_DoubleCheckedSingleton {
	private static volatile Q1_DoubleCheckedSingleton instance;

	private Q1_DoubleCheckedSingleton() {
	}

	public static Q1_DoubleCheckedSingleton getInstance() {
		if (instance == null) {
			synchronized (Q1_DoubleCheckedSingleton.class) {
				if (instance == null) {
					instance = new Q1_DoubleCheckedSingleton();
				}
			}
		}
		return instance;
	}
}
