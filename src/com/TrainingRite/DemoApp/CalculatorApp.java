package com.TrainingRite.DemoApp;

public class CalculatorApp {

	public static void main(String[] args) {
		// Static - Java will create at time of creation
		// Static Methods belong to the CLASS (NOT THE OBJECT)
		// New - Java will create at time of instantiation
		// Calculator.DoMath();
		Calculator calc = new Calculator();
		// calc.FindArea();
		// calc.DoMath();
		int A = 20;
		int B = 30;
		// Call a method and pass two parameters
		calc.sum(A, B);
		double C = calc.product(A, B);
		System.out.println("The product of the two numbers is: " + C);
		
	}

}

class Calculator {
	public static void DoMath() {
		System.out.println("Do different operations");
	}
	public void findArea() {
		System.out.println("Finding area");
	}
	
	// Find the sum of two numbers
	public void sum(int numA, int numB) {
		int Sum;
		Sum = numA + numB;
		System.out.println("The sum of two numbers is: " + Sum);
	}
	
	// Find the product of two numbers
	public double product(int numA, int numB) {
		double C = numA * numB;
		return C;
	}
}
