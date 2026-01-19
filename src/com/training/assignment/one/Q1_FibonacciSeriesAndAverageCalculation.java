package com.training.assignment.one;

public class Q1_FibonacciSeriesAndAverageCalculation {
	
	static void fibonacciSeries(int size) {
		int[] arr = new int[size];
		arr[0] = 1;
		arr[1] = 1;
		double sum = arr[0] + arr[1];
		
		for(int i = 2; i < size; i++) {
			arr[i] = arr[i -1] + arr[i - 2];
			sum += arr[i];
		}
		
		printArr(arr);
		
		System.out.println("\nThe avg is: "  + sum/size);
	}
	
	static void printArr(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
	}
	
	public static void main(String[] args) {
		
		fibonacciSeries(20);
	}

}
