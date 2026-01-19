package com.training.assignment.one;

import java.util.Scanner;

public class Q5_NextDateCalculator {

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static int getDaysInMonth(int month, int year) {

		switch (month) {
		case 1:
			return 31;
		case 3:
			return 31;
		case 5:
			return 31;
		case 7:
			return 31;
		case 8:
			return 31;
		case 10:
			return 31;
		case 12:
			return 31;

		case 4:
			return 30;
		case 6:
			return 30;
		case 9:
			return 30;
		case 11:
			return 30;

		case 2:
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}

		default:
			return -1; // invalid month
		}
	}

	public static boolean isValidDate(int d, int m, int y) {

		if (y <= 0)
			return false;

		if (m < 1 || m > 12)
			return false;

		int maxDays = getDaysInMonth(m, y);

		if (maxDays == -1)
			return false;

		return d >= 1 && d <= maxDays;
	}

	public static int[] nextDate(int d, int m, int y) {

		int maxDays = getDaysInMonth(m, y);

		if (d < maxDays) {
			return new int[] { d + 1, m, y };
		}

		if (m < 12) {
			return new int[] { 1, m + 1, y };
		}

		return new int[] { 1, 1, y + 1 };
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter day: ");
		int d = sc.nextInt();

		System.out.print("Enter month: ");
		int m = sc.nextInt();

		System.out.print("Enter year: ");
		int y = sc.nextInt();
		sc.close();

		if (!isValidDate(d, m, y)) {
			System.out.println("Invalid Date!");
			return;
		}

		int[] next = nextDate(d, m, y);

		System.out.println("Today: " + d + "/" + m + "/" + y);
		System.out.println("Next Date: " + next[0] + "/" + next[1] + "/" + next[2]);

	}

}
