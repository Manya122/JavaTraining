package com.training.assignment.two;

public class Q1_ImplementUMLForCircleClass {

    private double radius;

    public Q1_ImplementUMLForCircleClass() {
        this.radius = 1.0;
    }

    public Q1_ImplementUMLForCircleClass(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive. Setting to 1.0");
            this.radius = 1.0;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    
    // go to TestCircle for execution of code
}

