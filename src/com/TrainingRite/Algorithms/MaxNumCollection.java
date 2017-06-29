package com.TrainingRite.Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNumCollection {

	public static void main(String[] args) {
		// Should we ask the user up-front how many elements?
		// OR should we let user add elements until they are done?
		// The user will add elements until the hit 0
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("Enter a number (type 0 when finished): ");
			int num = in.nextInt();
			if (num == 0) { break; }
			else { numbers.add(num); }
		} while (1!=0);
		System.out.println(numbers);
		
		int max = numbers.get(0);
		for (int n : numbers) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println("The maximum number you entered is: " + max);
	}

}
