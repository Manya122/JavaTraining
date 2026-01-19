package com.training.assignment.one;
import java.util.Scanner;

public class Q2_GradesAverageCalculator {
	
	static int[] getGradesAndAvg() {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int count = 0;
		
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		int grade;
		int[] grades = new int[n];
		
		while( count < n) {
			System.out.println("Enter grade of " + (count + 1) + "th student: ");
			grade = sc.nextInt();
			if(grade >= 0 && grade <= 100) {
				grades[count] = grade;
				sum += grades[count];
				count++;
			}
			else {
				System.out.println("Invalid grade. Try again.");
			}
		}
		
		System.out.println("The avg. grade of class: " + sum/n);
		
		sc.close();
		
		return grades;
	}
	
	public static void main(String[] args) {
		getGradesAndAvg();
		
	}

}
