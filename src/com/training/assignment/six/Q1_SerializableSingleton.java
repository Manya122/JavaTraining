package com.training.assignment.six;

import java.io.Serializable;

public class Q1_SerializableSingleton implements Serializable {

	private static final Q1_SerializableSingleton INSTANCE = new Q1_SerializableSingleton();

	private Q1_SerializableSingleton() {
	}

	public static Q1_SerializableSingleton getInstance() {
		return INSTANCE;
	}

	// FIX
	protected Object readResolve() {
		return INSTANCE;
	}
}
