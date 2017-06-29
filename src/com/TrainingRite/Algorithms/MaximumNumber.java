package com.TrainingRite.Algorithms;

import java.util.Scanner;

/*
 * Ask the user for numbers
 * Place them into array
 * Find the maximum
 * 
 */

public class MaximumNumber {

	public static void main(String[] args) {
		int size = 5;
		int numbers[] = new int[size];
		
		// 1. Asking the user for numbers
		for (int i = 0; i < size; i++) {
			System.out.print("Enter a number: ");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			numbers[i] = num;
		}
		
		// Assume the largest element is the first element
		int max = numbers[0];
		for (int n : numbers) {
			// Testing to see if the given element is greater than the max
			if (n > max) {
				// Reassign max to the element
				max = n;
			}
		}
		
		System.out.println("The largest number is: " + max);
		
		/*
		for (int n : numbers) {
			System.out.println(n);
		}
		*/
	}

}
