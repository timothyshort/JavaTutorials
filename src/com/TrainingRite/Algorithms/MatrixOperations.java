package com.TrainingRite.Algorithms;

import java.util.Scanner;

/*
 * Ask the user for the size of the matrix (ask for rows and columns)
 * Ask the user to input each element into the matrix
 * Add appropriate exception handling
 * Ask the user if they want to add / scale / swap rows
 * The user will decide when they are finished
 */

public class MatrixOperations {

	public static void main(String[] args) {
		// 1. Ask the user for the size of the matrix
		System.out.print("Enter the size of the square matrix: ");
		Scanner in = new Scanner(System.in);
		int size = 3;
		try {
			size = in.nextInt();
			// Test condition for size
			if (size > 10) {
				throw new SizeRangeErrorException();
			}
		} catch (SizeRangeErrorException e) {
			System.out.println("ERROR: BAD INPUT");
		}
		
		// 2. Generate the square matrix
		double m[][] = new double[size][size];
		System.out.println("User enters size: " + size);
		m = Utilities.generateSquareMatrix(size);
		
		// 3. Verify
		Utilities.iterate(m);
		
		// 4. Ask the user for input on operations
		System.out.print("\nAVAILABLE ROW OPERATIONS:\n"
				+ "Press 1 to add a value row \n"
				+ "Press 2 to scale values of a row\n"
				+ "Press 3 to swap values of a row\n"
				+ "Enter the row operation you want to perform: "
				);
		int choice = in.nextInt();
		if (choice == 1) {
			System.out.print("Select the row you want to add a value to: ");
			int row = in.nextInt();
			System.out.print("What value do you want to add? ");
			int value = in.nextInt();
			System.out.println("Thanks...\nAdding " + value + " to row " + (row));
			// Call method to perform add algorithm
			m = Utilities.addToRow(m, row-1, value);
			Utilities.iterate(m);
		}
		else if (choice == 2) {
			System.out.print("Select the row you want to scale: ");
			int row = in.nextInt();
			System.out.print("What factor do you want to scale? ");
			int factor = in.nextInt();
			System.out.println("Thanks...\nScaling row " + row + " to factor of " + factor);
			// Call method to perform scale algorithm
			m = Utilities.scaleRow(m, row-1, factor);
			Utilities.iterate(m);
		}
		else if (choice == 3) {
			System.out.print("Select the first row you want to swap: ");
			int row1 = in.nextInt();
			System.out.print("Select the row that you want to swap with: ");
			int row2 = in.nextInt();
			System.out.println("Thanks...\nSwapping row " + (row1 -1 )+ " with " + (row2-1));
			// Call method to perform swap algorithm
			m = Utilities.swapRows(m, (row1-1), (row2-1));
			Utilities.iterate(m);
		}
		else {
			// break
		}
	}

}

class SizeRangeErrorException extends Exception {
	
}
