package com.training.assignment.two;

public class TestCircle {

    public static void main(String[] args) {

        
        Q1_CircleClass c1 = new Q1_CircleClass();

        System.out.println("Circle 1:");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());

        System.out.println();

        
        Q1_CircleClass c2 = new Q1_CircleClass(2.0);

        System.out.println("Circle 2:");
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Circumference: " + c2.getCircumference());

        System.out.println();

        
        Q1_CircleClass c3 = new Q1_CircleClass(5.5);

        System.out.println("Circle 3:");
        System.out.println("Radius: " + c3.getRadius());
        System.out.println("Area: " + c3.getArea());
        System.out.println("Circumference: " + c3.getCircumference());
    }
}
