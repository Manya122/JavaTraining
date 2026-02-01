package com.training.assignment.seven;

import java.util.List;

public class Q1_Book {
	private String title;
	private List<Q1_Author> authors;
	private int pages;
	private Q1_Subject subject;
	private int year;
	private String isbn;

	public Q1_Book(String title, List<Q1_Author> authors, int pages, Q1_Subject subject, int year, String isbn) {
		this.title = title;
		this.authors = authors;
		this.pages = pages;
		this.subject = subject;
		this.year = year;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public List<Q1_Author> getAuthors() {
		return authors;
	}

	public int getPages() {
		return pages;
	}

	public Q1_Subject getSubject() {
		return subject;
	}

	public int getYear() {
		return year;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return title + " (" + pages + " pages, " + year + ")";
	}
}
