package com.training.assignment.three;

public class Q5_UserRegistration {

	public static void registerUser(String name, String country) throws Q5_InvalidCountryException {

		if (!country.equalsIgnoreCase("India"))
			throw new Q5_InvalidCountryException("User outside India cannot register");

		System.out.println("User registration done successfully");
	}

	public static void main(String[] a) {

		try {
			registerUser("Raj", "USA");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			registerUser("Amit", "India");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
