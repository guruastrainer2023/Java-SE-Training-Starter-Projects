package com.training.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Manager;
import com.training.bean.RegionalManager;
import com.training.ds.Demo6;
import com.training.ds.Demo7;

public class Main07 {

	public static void main(String[] args) {


		List<Number> numList=new ArrayList<>();
		numList.add(10);
		numList.add(20.0);
		numList.add(30L);
		
		Demo7.printData(numList);
		//------------------------------------------------------
		
		List<Integer> intList=new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		Demo7.printData(intList);
		//--------------------------------------------------------
		
		List<Double> doubleList=new ArrayList<>();
		doubleList.add(10.0);
		doubleList.add(20.0);
		doubleList.add(30.0);
		
		//Demo7.printData1(doubleList);  // error
		
		

		
		
		
	}

}
