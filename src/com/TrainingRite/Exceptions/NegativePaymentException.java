package com.TrainingRite.Exceptions;

public class NegativePaymentException extends Exception {
	
	double amount;
	public NegativePaymentException(double amount) {
		this.amount = amount;
	}
	public String toString() {
		return ("NegativePaymentException: " + amount);
	}

}
