package com.training.assignment.one;
import java.util.Scanner;

public class Q4_PascalsTriangle {
	public static void printPascal(int n) {
		int[][] pascal = new int[n][n];

        for (int i = 0; i < n; i++) {

            // for spacing
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                }
                else
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];

                System.out.print(pascal[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the depth of pascal's triangle: ");
    	int depth = sc.nextInt();
        printPascal(depth);
        sc.close();
    }
}
