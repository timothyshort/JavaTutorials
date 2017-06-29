package com.TrainingRite.Algorithms;

public class Sorting {

	public static void main(String[] args) {		
		// 1. Generate an array 1-dimensional array and populate with random integers
		int numbers[] = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Utilities.randomNumber();
		}
		
		// 2. Verify by iterating through array
		Utilities.iterate(numbers);
		
		// 3. Call the sort method
		numbers = Utilities.bubbleSort(numbers);
		Utilities.iterate(numbers);
	}

}
