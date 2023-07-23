package com.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import com.training.ds.Demo5;

public class Main05 {

	public static void main(String[] args) {
		List<Integer> list1=new LinkedList<>();
		list1.add(100); list1.add(200); list1.add(300);
		
		Demo5.printNumericData(list1);
		
		// -----------------------------------------------------------
		
		List<Double> list2=new ArrayList<>();
		list2.add(900.00); list2.add(1000.00); list2.add(1200.00);
		Demo5.printNumericData(list2);
		
		// -----------------------------------------------------------
		
		List<Long> list3=new LinkedList<>();
		list3.add(1L); list3.add(2L); list3.add(3L);
		Demo5.printNumericData(list3);;
		

	}

}
 