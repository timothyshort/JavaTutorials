package com.TrainingRite.Exceptions;

public class Exception1 {

	public static void main(String[] args) {
		
		// This class handles Arithmetic Exceptions
		
		int x = 5;
		int y = 0;
		
		try {
			int z = x/y;
			System.out.println("Answer is: " + z);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
			System.out.println(e.toString());
		}
		
		System.out.println("The program is closing");
	}

}
