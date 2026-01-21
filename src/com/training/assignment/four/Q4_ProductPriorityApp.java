package com.training.assignment.four;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Q4_ProductPriorityApp {

    public static void main(String[] args) {

        // Lowest price first
        PriorityQueue<Q4_Product> queue =
            new PriorityQueue<>(new Comparator<Q4_Product>() {
                @Override
                public int compare(Q4_Product p1, Q4_Product p2) {
                    return Double.compare(
                        p1.getProductPrice(),
                        p2.getProductPrice()
                    );
                }
            });

        queue.add(new Q4_Product(1, "Laptop", 60000));
        queue.add(new Q4_Product(2, "Bag", 400));
        queue.add(new Q4_Product(3, "Notebook", 25));
        queue.add(new Q4_Product(4, "Pen", 10));
        queue.add(new Q4_Product(5, "Mobile", 15000));

        while (!queue.isEmpty()) {
            System.out.println(
                "Processing product: " + queue.poll()
            );
        }
    }
}
