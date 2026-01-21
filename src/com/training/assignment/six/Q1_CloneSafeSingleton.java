package com.training.assignment.six;

public class Q1_CloneSafeSingleton implements Cloneable {

	private static final Q1_CloneSafeSingleton INSTANCE = new Q1_CloneSafeSingleton();

	private Q1_CloneSafeSingleton() {
	}

	public static Q1_CloneSafeSingleton getInstance() {
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning of singleton not allowed");
	}
}
