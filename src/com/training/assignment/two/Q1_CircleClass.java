package com.training.assignment.two;

public class Q1_CircleClass {

    private double radius;
    private String color;

    // Default constructor
    public Q1_CircleClass() {
        radius = 1.0;          
        color = "red";
    }

    public Q1_CircleClass(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;   
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
