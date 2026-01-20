package com.training.assignment.two;

import java.util.Scanner;

public class Q2_BookStore {
	private Q2_Book[] books = new Q2_Book[10];
	private int count = 0;

	public void sell(String title, int qty) {

		for (int i = 0; i < count; i++) {

			if (books[i].getBookTitle().equalsIgnoreCase(title)) {

				if (!books[i].decreaseCopies(qty)) {
					System.out.println("Not enough stock.");
				} else {
					System.out.println("Sold successfully.");
				}
				return;
			}
		}
		System.out.println("Book not found.");
	}

	public void order(String isbn, int qty) {

		for (int i = 0; i < count; i++) {

			if (books[i].getISBN().equals(isbn)) {
				books[i].increaseCopies(qty);
				System.out.println("Stock updated.");
				return;
			}
		}

		if (count >= 10) {
			System.out.println("Store full – cannot add new book.");
			return;
		}

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter title: ");
		String title = sc.nextLine();

		System.out.print("Enter author: ");
		String author = sc.nextLine();

		books[count++] = new Q2_Book(title, author, isbn, qty);

		System.out.println("New book added.");
		
	}

	public void display() {

		System.out.println("---- INVENTORY ----");

		for (int i = 0; i < count; i++) {
			books[i].display();
		}
	}
}
