package com.TrainingRite.Algorithms;

public class MatrixInversion {

	public static void main(String[] args) {
		// Define double array (matrix)
		double matrix[][] = new double[4][5];
		int rowSize = matrix.length;
		int colSize = matrix[0].length;
		int tens=1;
		
		System.out.println("Generating matrix. Size: " + rowSize + " x " + colSize);
		
		// Populate the matrix using the randomNumber method from Utilities class
		for (int x=0; x<rowSize; x++) {
			for (int y=0; y<colSize; y++) {
				matrix[x][y] = Utilities.randomNumber(tens);
			}
		}
		
		// Iterate through the matrix to verify a successful matrix generation
		Utilities.iterate(matrix);
		
		// Invert the matrix
		double iM[][] = new double[colSize][rowSize];
		iM = Utilities.invertMatrix(matrix);
		Utilities.iterate(iM);
	}

}
