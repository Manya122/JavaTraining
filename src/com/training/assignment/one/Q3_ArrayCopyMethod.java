package com.training.assignment.one;

import java.util.Scanner;

public class Q3_ArrayCopyMethod {
	public static int[] copyOf(int[] array) {
		int size = array.length;
		int[] copy = new int[size];
		
		if(size == 0) {
			return copy;
		}
		
		for(int i = 0; i < size; i++) {
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array elements: ");
		int size = sc.nextInt();
		
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
		for(int i = 0 ; i < arr1.length; i++) {
			System.out.println("Enter "+ (i+1) + "th elemnt of array: ");
			arr1[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.print("Array before modification of copy: ");
		printArr(arr1);
		
		arr2 = copyOf(arr1);
		
		System.out.print("Copied Array before modification:");
		printArr(arr2);
		
		int modifiedInd = 0;
		
		if(modifiedInd < arr2.length) {
			arr2[modifiedInd]++;
		}
		
		System.out.print("Copied Array after modification:");
		printArr(arr2);
		
		System.out.print("Array after modification of copy: ");
		printArr(arr1);
		
		if(arr1 == arr2) {
			System.out.println("Both arrays are same");
		}
		else {
			System.out.println("Both arrays are different");
		}
		
	}
}
