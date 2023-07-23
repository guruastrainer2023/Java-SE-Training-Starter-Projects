package com.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.training.ds.Demo7;
import com.training.ds.Demo9;

public class Main09 {

	public static void main(String[] args) {
		List<Number> numList=new ArrayList<>();
		numList.add(10);
		numList.add(20.0);
		numList.add(30L);
		
		Demo9.printData(numList);
		//------------------------------------------------------
		
		List<Integer> intList=new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		Demo9.printData(intList);
		//--------------------------------------------------------
		
		List<Double> doubleList=new ArrayList<>();
		doubleList.add(10.0);
		doubleList.add(20.0);
		doubleList.add(30.0);
		
		Demo9.printData(doubleList);  

	}

}
