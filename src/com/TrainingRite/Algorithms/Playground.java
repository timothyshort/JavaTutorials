package com.TrainingRite.Algorithms;



public class Playground {

	public static void main(String[] args) {
		double a[][] = new double[4][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
			a[i][j] = (int) (Math.random()*100);
		}
		Utilities.iterate(a);
		
		int rowA=2;
		int rowB=3;
		
		double tmpRow[] = a[rowA];
		a[rowA] = a[rowB];
		a[rowB] = tmpRow;
		
		Utilities.iterate(a);
		
		/*
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i]/2;
			System.out.println(a[i]);
		}
		*/
		
	}

}
