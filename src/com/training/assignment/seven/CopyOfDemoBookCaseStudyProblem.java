package com.training.assignment.seven;
import java.util.*;

class Author {
	private String name;
	private String lastname;
	private String country;
}

class Book {
	private String title;
	private List<Author> authors;
	private int pages;
	private Subject subject;
	private int year;
	private String isbn;
}

enum Subject {
	JAVA, DOT_NET, ORACLE;
}

public class CopyOfDemoBookCaseStudyProblem {
	public static void main(String[] args) {
		List<Book> allBooks = loadAllBooks();
		// 1. Find books with more than 400 pages
		// 2. Find all books that are Java books and more than 400 pages
		// 3. We need the top three longest books
		// 4. We need from the fourth to the last longest books
		// 5. We need to get all the publishing years
		// 6. We need all the authors' names who have written a book
		// 7. We need all the origin countries of the authors
		// 8. We want the most recent published book.
		// 9. We want to know if all the books are written by more than one
		author
		// 10. We want one of the books written by more than one author.
		(findAny)
		// 11. We want the total number of pages published.
		// 12. We want to know how many pages the longest book has.
		// 13. We want the average number of pages of the books
		// 14. We want all the titles of the books
		// 15. We want the book with the highest number of authors
		// 16. We want a Map of <year, list of books>
		// 17. We want to count how many books are published per year.
		}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"), new Author("ekta", "gupta", "in"));
		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));
		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"), new Author("keshav", "gupta", "us"));
		books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));
		return books;
	}

}
