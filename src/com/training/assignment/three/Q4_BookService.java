package com.training.assignment.three;

import java.io.*;
import java.util.*;

public class Q4_BookService {

    LinkedList<Q4_Book> list = new LinkedList<>();

    // ---- Load from file ----
    public void load() throws Exception {

        BufferedReader br =
            new BufferedReader(
                new FileReader("resources/books.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] d = line.split(":");

            Q4_Book b = new Q4_Book(
                Integer.parseInt(d[0]),
                d[1], d[2], d[3],
                Integer.parseInt(d[4])
            );

            list.add(b);
        }

        br.close();
    }

    // ---- Search ----
    public Q4_Book searchBook(int id) {

        for (Q4_Book b : list)
            if (b.id == id)
                return b;

        return null;
    }

    // ---- Sell ----
    public void sellBook(String isbn, int qty)
        throws Q4_NotSufficientBookException {

        for (Q4_Book b : list) {

            if (b.isbn.equals(isbn)) {

                if (b.price < qty)
                    throw new Q4_NotSufficientBookException(
                        "Insufficient stock");

                b.price -= qty;
                return;
            }
        }
    }

    // ---- Purchase ----
    public void purchaseBook(String isbn, int qty) {

        for (Q4_Book b : list) {
            if (b.isbn.equals(isbn)) {
                b.price += qty;
                return;
            }
        }
    }

    public void display() {
        list.forEach(System.out::println);
    }
}
