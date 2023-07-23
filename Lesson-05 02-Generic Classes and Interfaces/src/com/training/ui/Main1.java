package com.training.ui;

import com.training.bean.ds.IntStackImpl;

public class Main1 {

	public static void main(String[] args) {
		IntStackImpl intStack=new IntStackImpl(10);
		
		intStack.push(25);
		intStack.push(12);
		intStack.push(16);
		intStack.push(18);
		intStack.push(20);
		
		System.out.println(intStack.toString());
		System.out.println(intStack.pop());
		
		System.out.println(intStack.pop());

		System.out.println(intStack.pop());

		System.out.println(intStack.toString());
	}

}
