package com.TrainingRite.Exceptions;

public class NegativePaymentException extends Exception {
	
	// This is a user defined exception that will throw an exception when there is a negative number
	
	double amount;
	public NegativePaymentException(double amount) {
		this.amount = amount;
	}
	public String toString() {
		return ("NegativePaymentException: " + amount);
	}

}
