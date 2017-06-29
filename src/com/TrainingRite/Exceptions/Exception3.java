package com.TrainingRite.Exceptions;

import java.util.Scanner;
import com.TrainingRite.Exceptions.NegativePaymentException;

public class Exception3 {

	public static void main(String[] args) {
		boolean success = true;
		// Makes a payment
		// Handle errors if negative payment applied
		
		// 1. Ask user for payment
		
		do {
			System.out.print("Enter payment amount: ");
			Scanner in = new Scanner(System.in);
			
			// 2. Identify Problem Spot
			try {
				double amount = in.nextDouble();
				
				// 3. Test value for exception
				if (amount < 0) {
					throw new NegativePaymentException(amount);
				}
				System.out.println(amount);
			} catch (NegativePaymentException e) {
				System.out.println("Cannot take a negative number for payment");
				System.out.println(e.toString());
				success = false;
				System.out.println("*****");
				System.out.println("Please try again");
			}
		} while (success == false);
		System.out.println("Thank you for making your payment.");
	}

}