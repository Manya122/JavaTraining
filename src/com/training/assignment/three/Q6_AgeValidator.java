package com.training.assignment.three;

public class Q6_AgeValidator {

    public static void main(String[] args) {

        try {

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60)
                throw new Q6_InvalidAgeException(
                    "Age must be between 18 and 59");

            System.out.println("Name: " + name
                             + ", Age: " + age);

        } catch (Q6_InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
