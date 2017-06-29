package com.TrainingRite.DemoApp;

public class DoubleArray {

	public static void main(String[] args) {
		// Create a double array
		int rows = 8;
		int cols = 5;
		int arr[][] = new int[rows][cols];
		// arr[0][0] = 23;
		// System.out.println(arr[0][0]);
		
		// Generate random integer values to popular each element
		
		// Iterate throw each row
		for (int i = 0; i < rows; i++) {
			// For each row, iterate through each column
			for (int j = 0; j < cols; j++) {
				int val = (int) (Math.random() * 100);
				arr[i][j] = val;
				System.out.println("Assing value at: [" + i +"][" + j + "] = " + val );
			}
		}
		
		for (int a = 0; a < rows; a++) {
			System.out.print("[ ");
			for (int b = 0; b < cols; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println(" ]");
		}
	}

}
