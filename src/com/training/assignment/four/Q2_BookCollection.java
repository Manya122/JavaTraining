package com.training.assignment.four;

import java.util.Arrays;
import java.util.Comparator;

public class Q2_BookCollection {

	private String ownerName;
	private Q2_Book[] books;

	public Q2_BookCollection(String ownerName, Q2_Book[] books) {
		this.ownerName = ownerName;
		this.books = books;
	}

	// Check if collection already has the book
	public boolean hasBook(Q2_Book b) {

		for (Q2_Book book : books) {
			if (book.equals(b)) {
				return true;
			}
		}
		return false;
	}

	public void sort() {

		Arrays.sort(books, new Comparator<Q2_Book>() {
			@Override
			public int compare(Q2_Book b1, Q2_Book b2) {

				int titleCompare = b1.getTitle().compareToIgnoreCase(b2.getTitle());

				if (titleCompare != 0) {
					return titleCompare;
				}

				return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
			}
		});
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Owner: ").append(ownerName).append("\n");
		sb.append("Books:\n");

		for (Q2_Book book : books) {
			sb.append(book).append("\n");
		}

		return sb.toString();
	}
}