package com.training.assignment.six;

import java.lang.reflect.Constructor;

public class Q1_SingletonTestApp {
	public static void main(String[] args) throws Exception {

		System.out.println("Eager:");
		System.out.println(Q1_EagerSingleton.getInstance().hashCode());
		System.out.println(Q1_EagerSingleton.getInstance().hashCode());

		System.out.println("\nDouble Checked:");
		System.out.println(Q1_DoubleCheckedSingleton.getInstance().hashCode());
		System.out.println(Q1_DoubleCheckedSingleton.getInstance().hashCode());

		System.out.println("\nEnum:");
		System.out.println(Q1_EnumSingleton.INSTANCE.hashCode());
		System.out.println(Q1_EnumSingleton.INSTANCE.hashCode());

		// Reflection attack demo (will FAIL due to guard)
		System.out.println("\nReflection Test:");
		try {
			Constructor<Q1_ReflectionSafeSingleton> c = Q1_ReflectionSafeSingleton.class.getDeclaredConstructor();
			c.setAccessible(true);
			Q1_ReflectionSafeSingleton s2 = c.newInstance();
			System.out.println(s2.hashCode());
		} catch (Exception e) {
			System.out.println("Reflection blocked");
		}
	}
}
