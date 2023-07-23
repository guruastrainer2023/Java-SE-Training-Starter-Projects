package com.training.ui;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		
		List<Integer> integerList1=new LinkedList<>();
		integerList1.add(new Integer(50));
		integerList1.add(Integer.valueOf(100));
		integerList1.add(150);
		
		System.out.println(integerList1);
		
		//========================================================================
		
		List<Integer> integerList2=List.of(
				new Integer(10), 
				Integer.valueOf(20), 
				Integer.valueOf(30), 
				Integer.valueOf(40), 
				50, 
				60, 
				Integer.valueOf(70), 
				80, 
				new Integer(90), 
				100);
		
		System.out.println(integerList2);
		integerList2.add(500);
		//Collections.sort(integerList2);
		//System.out.println(integerList2.getClass().getName());

	}

}
