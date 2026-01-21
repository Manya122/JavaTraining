package com.training.assignment.three;

import java.util.Scanner;

public class Q7_Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter the 2 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int q = a / b;

            System.out.println(
                "The quotient of " + a + "/" + b + " = " + q);

        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
