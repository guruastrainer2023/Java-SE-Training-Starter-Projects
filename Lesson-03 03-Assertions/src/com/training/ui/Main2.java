package com.training.ui;

public class Main2 {

	public static void main(String[] args) {
		printPositiveNumbersSum(-10, 20);
	}
	
	private static void printPositiveNumbersSum(int i, int j) {
		assert (i>=0 && j>=0) : "This works only for Positive Numbers";
		System.out.println(i+j);
	}

}
