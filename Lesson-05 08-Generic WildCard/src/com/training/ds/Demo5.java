package com.training.ds;

import java.util.List;

public class Demo5 {

	// upper bounded wild card
	public static void printNumericData(List<? extends Number> list){
		for(Number number:list) {
			System.out.println(number);
		}
	}
}
