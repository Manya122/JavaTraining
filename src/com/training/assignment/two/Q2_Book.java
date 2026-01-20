package com.training.assignment.two;

public class Q2_Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;

	public Q2_Book(String bookTitle, String author, String ISBN, int numOfCopies) {

		if (numOfCopies < 0) {
			throw new IllegalArgumentException("Quantity must be non-negative");
		}

		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void increaseCopies(int count) {
		numOfCopies += count;
	}

	public boolean decreaseCopies(int count) {
		if (count > numOfCopies) {
			return false;
		}
		numOfCopies -= count;
		return true;
	}

	public void display() {
		System.out.println(bookTitle + " – " + author + " – " + ISBN + " – Qty: " + numOfCopies);
	}
}
