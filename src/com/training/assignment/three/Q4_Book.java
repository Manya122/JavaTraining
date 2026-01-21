package com.training.assignment.three;

public class Q4_Book {

    int id;
    String isbn;
    String title;
    String author;
    int price;

    public Q4_Book(int id, String isbn,
                   String title, String author, int price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return id + " " + isbn + " "
             + title + " " + author + " " + price;
    }
}
