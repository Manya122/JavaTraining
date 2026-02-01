package com.training.assignment.seven;

import java.util.*;
import java.util.stream.Collectors;

public class Q1_BookCaseStudy {

    public static void main(String[] args) {

        List<Q1_Book> allBooks = loadAllBooks();

        // 1. Books with more than 400 pages
        System.out.println("1. Books with > 400 pages:");
        allBooks.stream()
                .filter(b -> b.getPages() > 400)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 2. Java books with more than 400 pages
        System.out.println("\n2. Java books with > 400 pages:");
        allBooks.stream()
                .filter(b -> b.getSubject() == Q1_Subject.JAVA && b.getPages() > 400)
                .forEach(System.out::println);

        // 3. Top 3 longest books
        System.out.println("\n3. Top 3 longest books:");
        allBooks.stream()
                .sorted(Comparator.comparing(Q1_Book::getPages).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 4. Books from 4th position to last (by length)
        System.out.println("\n4. Books ranked 4th to last:");
        allBooks.stream()
                .sorted(Comparator.comparing(Q1_Book::getPages).reversed())
                .skip(3)
                .forEach(System.out::println);

        // 5. All publishing years
        System.out.println("\n5. Publishing years:");
        allBooks.stream()
                .map(Q1_Book::getYear)
                .distinct()
                .forEach(System.out::println);

        // 6. All author names
        System.out.println("\n6. All author names:");
        allBooks.stream()
                .flatMap(b -> b.getAuthors().stream())
                .map(Q1_Author::getName)
                .distinct()
                .forEach(System.out::println);

        // 7. All author countries
        System.out.println("\n7. Author countries:");
        allBooks.stream()
                .flatMap(b -> b.getAuthors().stream())
                .map(Q1_Author::getCountry)
                .distinct()
                .forEach(System.out::println);

        // 8. Most recently published book
        System.out.println("\n8. Most recent book:");
        allBooks.stream()
                .max(Comparator.comparing(Q1_Book::getYear))
                .ifPresent(System.out::println);

        // 9. Are all books written by more than one author?
        System.out.println("\n9. All books have multiple authors?");
        boolean allMultiAuthor =
                allBooks.stream().allMatch(b -> b.getAuthors().size() > 1);
        System.out.println(allMultiAuthor);

        // 10. Any one book with more than one author
        System.out.println("\n10. Any book with multiple authors:");
        allBooks.stream()
                .filter(b -> b.getAuthors().size() > 1)
                .findAny()
                .ifPresent(System.out::println);

        // 11. Total number of pages
        System.out.println("\n11. Total pages:");
        int totalPages =
                allBooks.stream()
                        .map(Q1_Book::getPages)
                        .reduce(0, Integer::sum);
        System.out.println(totalPages);

        // 12. Pages of longest book
        System.out.println("\n12. Pages in longest book:");
        allBooks.stream()
                .map(Q1_Book::getPages)
                .max(Integer::compare)
                .ifPresent(System.out::println);

        // 13. Average number of pages
        System.out.println("\n13. Average pages:");
        double avgPages =
                allBooks.stream()
                        .collect(Collectors.averagingInt(Q1_Book::getPages));
        System.out.println(avgPages);

        // 14. All book titles
        System.out.println("\n14. Book titles:");
        allBooks.stream()
                .map(Q1_Book::getTitle)
                .forEach(System.out::println);

        // 15. Book with highest number of authors
        System.out.println("\n15. Book with most authors:");
        allBooks.stream()
                .max(Comparator.comparing(b -> b.getAuthors().size()))
                .ifPresent(System.out::println);

        // 16. Map<Year, List<Book>>
        System.out.println("\n16. Books grouped by year:");
        Map<Integer, List<Q1_Book>> booksByYear =
                allBooks.stream()
                        .collect(Collectors.groupingBy(Q1_Book::getYear));
        booksByYear.forEach((y, b) -> System.out.println(y + " -> " + b));

        // 17. Count books per year
        System.out.println("\n17. Book count per year:");
        Map<Integer, Long> countPerYear =
                allBooks.stream()
                        .collect(Collectors.groupingBy(
                                Q1_Book::getYear, Collectors.counting()));
        countPerYear.forEach((y, c) -> System.out.println(y + " -> " + c));
    }

    private static List<Q1_Book> loadAllBooks() {

        List<Q1_Author> authors1 = Arrays.asList(
                new Q1_Author("raj", "gupta", "in"),
                new Q1_Author("ekta", "gupta", "in"));

        List<Q1_Author> authors2 = Arrays.asList(
                new Q1_Author("raj", "gupta", "in"));

        List<Q1_Author> authors3 = Arrays.asList(
                new Q1_Author("gunika", "gupta", "us"),
                new Q1_Author("keshav", "gupta", "us"));

        List<Q1_Book> books = new ArrayList<>();

        books.add(new Q1_Book("java", authors1, 400,
                Q1_Subject.JAVA, 2000, "1213"));
        books.add(new Q1_Book("python", authors2, 479,
                Q1_Subject.JAVA, 2007, "1218"));
        books.add(new Q1_Book("Mgt", authors3, 600,
                Q1_Subject.DOT_NET, 2000, "1293"));

        return books;
    }
}
