package com.TrainingRite.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * This class will read a file
 */

public class FileReaderClass {

	public static void main(String[] args) {
		// 1. Define the file (path) that we want to read
		String filename = "C:\\Users\\owner\\Desktop\\SDET-June2017\\JavaTutorials\\Files\\TestFile.txt";
		String text = null;
		
		// 2. Create the file in Java
		System.out.println("Creating the file...");
		File file = new File(filename);
		
		// 3. Open the file
		System.out.println("Opening the file...");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// 4. Read the file
			System.out.println("Reading the file...");
			text = br.readLine();

			// 5. Close the file resources
			System.out.println("Closing the file...");
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: FILE NOT FOUND");
			System.out.println(e.toString());
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
		} finally {
			System.out.println("Finished the reading file block...");
		}
		
		System.out.println(filename + "\n" + text);
		
		System.out.println("Program is closing");
	}

}
