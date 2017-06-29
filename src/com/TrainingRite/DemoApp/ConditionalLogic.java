package com.TrainingRite.DemoApp;

public class ConditionalLogic {

	public static void main(String[] args) {
		int number = 5;
		if (number > 10) {
			System.out.println("The number is greater than 10");
		}
		else if (number == 10) {
			System.out.println("The number is equal to 10");
		}
		else {
			System.out.println("The number is not greater than 10, and the number is not equal to 10");
		}
		
		String dayOfWeek = "Sunday";
		switch (dayOfWeek) {
			case "Monday" :
				System.out.println("Today is Monday");
				break;
			case "Tuesday" :
				System.out.println("Today is Tuesday");
				break;
			case "Wednesday" :
				System.out.println("Today is Wednesday");
				break;
			case "Thursday" :
				System.out.println("Today is Thursday");
				break;
			case "Friday" :
				System.out.println("Today is Friday");
				break;
			default :
				System.out.println("Today is the weekend");
		}
	}

}
