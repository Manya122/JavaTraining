package com.training.assignment.two;

public class TestCircle {

    public static void main(String[] args) {

        // Test 1 – default constructor
        Q1_ImplementUMLForCircleClass c1 =
            new Q1_ImplementUMLForCircleClass();
        display(c1);

        // Test 2 – valid radius
        Q1_ImplementUMLForCircleClass c2 =
            new Q1_ImplementUMLForCircleClass(5);
        display(c2);

        // Test 3 – another value
        Q1_ImplementUMLForCircleClass c3 =
            new Q1_ImplementUMLForCircleClass(2.5);
        display(c3);

        // Test 4 – invalid radius (validation check)
        Q1_ImplementUMLForCircleClass c4 =
            new Q1_ImplementUMLForCircleClass(-3);
        display(c4);

        // Test 5 – setter test
        c1.setRadius(10);
        display(c1);
    }

    // Helper method to display details
    public static void display(Q1_ImplementUMLForCircleClass c) {

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
        System.out.println("---------------------------");
    }
}
