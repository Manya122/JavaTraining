package com.training.assignment.six;

public class Q1_StaticBlockSingleton {
	private static final Q1_StaticBlockSingleton INSTANCE;

	static {
		try {
			INSTANCE = new Q1_StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private Q1_StaticBlockSingleton() {
	}

	public static Q1_StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
