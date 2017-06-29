package com.TrainingRite.Algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Read a file
 * Ask the user to input a character to search
 * Count the occurrences of that character
 */

public class CharacterSearch {

	public static void main(String[] args) {
		// Read the file
		
		// 1. Define the file (path) that we want to read
		String filename = "C:\\Users\\owner\\Desktop\\SDET-June2017\\JavaTutorials\\Files\\Quote.txt";
		String text = null;
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		// 3. Open the file
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// 4. Read the file
			text = br.readLine();

			// 5. Close the file resources
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: FILE NOT FOUND");
			System.out.println(e.toString());
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
		}
		
		System.out.println(filename + "\n" + text);
		
		// 2. Ask the user for a character to search
		System.out.print("Enter the letter you want to search for: ");
		Scanner in = new Scanner(System.in);
		String ch = in.next();
		in.close();
		System.out.println("Thanks. Searching for the letter ... " + ch + " ....");
		
		// 3. Write the algorithm to count the occurrences
		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			System.out.print("Is " + ch.charAt(0) + " = " + text.charAt(i) + "?  ");
			if (ch.toLowerCase().charAt(0) == text.toLowerCase().charAt(i)) {
				System.out.println("Yes, they are equal!");
				counter++;
			}
			else {
				System.out.println("NO");
			}
		}
		
	}

}
