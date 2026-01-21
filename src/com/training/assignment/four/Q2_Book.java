package com.training.assignment.four;

import java.util.Objects;

public class Q2_Book {

	private String title;
	private String author;
	private double price;

	public Q2_Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public boolean equals(Object o) {  // Two books are equal if title + author are same

		if (this == o)
			return true;
		if (!(o instanceof Q2_Book))
			return false;

		Q2_Book book = (Q2_Book) o;

		return title.equalsIgnoreCase(book.title) && author.equalsIgnoreCase(book.author);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title.toLowerCase(), author.toLowerCase());
	}

	@Override
	public String toString() {
		return title + " – " + author;
	}
}
