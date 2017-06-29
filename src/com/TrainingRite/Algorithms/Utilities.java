package com.TrainingRite.Algorithms;

import java.text.DecimalFormat;

/*
 * This class will contain helpful functions
 */

public class Utilities {
	
	// Random number generator (Integer)
	public static int randomNumber() {
		int rand = (int) (Math.random() * 100);
		return rand;
	}
	
	// Random Number Generator & Formatter
	public static double randomNumber(int tens) {
		// Generate the random number
		double ran = Math.random() * tens * 10;
		
		// Define the number format
		DecimalFormat decF = new DecimalFormat("#.#");
		
		// Convert the number to the right format
		ran = Double.valueOf(decF.format(ran));
		
		return ran;
	}
	
	public static void iterate(int a[]) {
		System.out.print("[ ");
		for (int element : a) {
			System.out.print(element + " ");
		}
		System.out.println("]");
	}
	
	// Iterate through an array
	public static void iterate(double m[][]) {
		System.out.println("Iterating through array");
		int row = m.length;
		int col = m[0].length;
		for (int i=0;i<row;i++) {
			System.out.print("[  ");
			for (int j=0;j<col;j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println("]");
		}
	}
	
	/*
	 * Invert a matrix
	 * 1. Create a new matrix, iM
	 * 2. iM Row Size should be the mCol size
	 * 3. iM Col Size should be the mRow size
	 * 4. Iterate through the new matrix iM (rowXcol) and value from m Matrix (colxRow)
	 */
	public static double[][] invertMatrix(double m[][]) {
		int mRow = m.length;
		int mCol = m[0].length;
		
		double iM[][] = new double[mCol][mRow];
		int row = iM.length;
		int col = iM[0].length;
		
		System.out.println("\nInverting matrix. Size: " + row + " x " + col);
		
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				iM[x][y] = m[y][x];
			}
		}
		return iM;
	}
	
	public static int[] bubbleSort(int a[]) {
		int n = a.length;
		int counter = 0;
		int k;
		for (int m = 0; m < n ; m++) {
			// System.out.println("WE ARE ENTERING A NEW ITERATION");
			counter++;
			for (int i = 0; i < n-1; i++) {
				counter++;
				k=i+1;
				System.out.print("COMPARING: " + a[i] + " ?> " + a[k]);
				if (a[i] > a[k]) {
					System.out.print("  <--- NEED TO SWAP");
					int temp = a[k];
					a[k] = a[i];
					a[i] = temp;
				}
				System.out.println();
			}
		}
		System.out.println("The program performed " + counter + " iterations");
		return a;
	}
	
	public static double[][] generateSquareMatrix(int size) {
		// Define square matrix
		double m[][] = new double[size][size];
		
		// Populate the elements
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				m[i][j] = randomNumber();
			}
		}
		return m;
	}
	
	public static double[][] addToRow(double a[][], int Row, int Value) {
		for (int i=0; i < a[0].length; i++) {
			a[Row][i] = a[Row][i] + Value;
		}
		return a;
	}
	
	public static double[][] scaleRow(double a[][], int Row, int Value) {
		for (int i=0; i < a[0].length; i++) {
			a[Row][i] = a[Row][i] * Value;
		}
		return a;
	}
	
	public static double[][] swapRows(double a[][], int Row1, int Row2) {
		// Algorithm to place all elements in Row1 into the temporary array
		double temp[] = new double[a[0].length];
		for (int i = 0; i < a[0].length; i++) {
			temp[i] = a[Row1][i];
			a[Row1][i] = a[Row2][i];
			a[Row2][i] = temp[i]; 
		}
		return a;
	}

}
