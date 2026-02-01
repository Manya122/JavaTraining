package com.training.assignment.seven;

public class Q1_Author {
	private String name;
	private String lastName;
	private String country;

	public Q1_Author(String name, String lastName, String country) {
		this.name = name;
		this.lastName = lastName;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return name + " " + lastName + " (" + country + ")";
	}
}
