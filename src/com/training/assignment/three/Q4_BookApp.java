package com.training.assignment.three;

public class Q4_BookApp {

    public static void main(String[] args) throws Exception {

        Q4_BookService s = new Q4_BookService();

        s.load();

        System.out.println("All Books:");
        s.display();

        System.out.println("\nSearch id 121:");
        System.out.println(s.searchBook(121));

        try {
            s.sellBook("A234", 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        s.purchaseBook("A234", 5);

        System.out.println("\nAfter Operations:");
        s.display();
    }
}
