package com.TrainingRite.DemoApp;

public class CarApp {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.start();
		car1.accelerate();
		
		System.out.println("**********\n");
		
		Car car2 = new Car("BMW");
		car2.start(5);
		Car car3 = new Car(10);
	}
}

class Car {
	
	// CONSTRUCTORS & OVERLOADING CONSTRUCTORS
	public Car() {		 // Default Constructor ()
		System.out.println("NEW CAR CREATED!");
	}
	
	public Car(String carMaker) {		// Overloading Constructors
		System.out.println("NEW CAR CREATED OF TYPE: " + carMaker);
	}
	
	public Car(int numberOfCars) {
		System.out.println("NEW CARS CREATED, QTY: " + numberOfCars);
	}
	
	public void start() {
		System.out.println("The car is starting");
	}
	public void start(int lagTime) {
		System.out.println("The car will start in: " + lagTime + " seconds.");
	}
	
	public void accelerate() {
		System.out.println("The car is accelerating");
	}
}