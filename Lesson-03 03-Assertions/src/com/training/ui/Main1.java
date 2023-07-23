package com.training.ui;

public class Main1 {

	public static void main(String[] args) {
		printPositiveNumbersSum(-10, 20);
		

	}
	
	private static void printPositiveNumbersSum(int i, int j) {
		assert (i>=0 && j>=0);
		System.out.println(i+j);
	}

}
