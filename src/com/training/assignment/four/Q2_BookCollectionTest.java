package com.training.assignment.four;

public class Q2_BookCollectionTest {

    public static void main(String[] args) {

        Q2_Book[] books = {
            new Q2_Book("Spring Boot", "Sharma", 450),
            new Q2_Book("Java in Depth", "Mehta", 550),
            new Q2_Book("Java Basics", "Raj", 300)
        };

        Q2_BookCollection collection =
            new Q2_BookCollection("Rajeev Gupta", books);

        Q2_Book search =
            new Q2_Book("Java in Depth", "Mehta", 0);

        System.out.println("Has 'Java in Depth'? "
                + collection.hasBook(search));

        collection.sort();
        System.out.println("\n" + collection);
    }
}
