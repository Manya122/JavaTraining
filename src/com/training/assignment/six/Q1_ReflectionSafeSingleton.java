package com.training.assignment.six;

public class Q1_ReflectionSafeSingleton {
	private static boolean instanceCreated = false;
	private static final Q1_ReflectionSafeSingleton INSTANCE = new Q1_ReflectionSafeSingleton();

	private Q1_ReflectionSafeSingleton() {
		if (instanceCreated) {
			throw new RuntimeException("Reflection not allowed");
		}
		instanceCreated = true;
	}

	public static Q1_ReflectionSafeSingleton getInstance() {
		return INSTANCE;
	}
}
