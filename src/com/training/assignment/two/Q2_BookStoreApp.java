package com.training.assignment.two;

public class Q2_BookStoreApp {
	public static void main(String[] args) {

		Q2_BookStore store = new Q2_BookStore();

		// Add sample books
		store.order("111", 5);
		store.order("222", 3);

		store.display();

		// Sell books
		store.sell("Java", 2);

		store.display();
	}
}
