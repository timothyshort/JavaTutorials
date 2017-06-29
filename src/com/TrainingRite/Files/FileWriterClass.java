package com.TrainingRite.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) {
		// 1. Define the file (path) that we want to write
		String filename = "C:\\Users\\owner\\Desktop\\SDET-June2017\\JavaTutorials\\Files\\TestOutput.txt";
		String myMessage = "This will be placed inside the file.";
		
		// 2. Create the file in Java
		System.out.println("Creating the file to write...");
		File file = new File(filename);
		
		// 3. Open the file
		System.out.println("Opening the file...");
		try {
			FileWriter fw = new FileWriter(file);
			
			// 4. Writing to the file
			System.out.println("Write to the file...");
			fw.write(myMessage);
			
			// 5. Close the file resources
			System.out.println("Closing the file...");
			fw.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("ERROR: FILE NOT FOUND");
			System.out.println(e.toString());
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
		} finally {
			System.out.println("Finished the write to file block...");
		}
		
		System.out.println("Program is closing");
	}

}
