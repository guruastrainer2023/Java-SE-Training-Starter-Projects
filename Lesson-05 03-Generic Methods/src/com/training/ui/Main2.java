package com.training.ui;

import com.training.bean.Circle;
import com.training.bean.Employee;
import com.training.bean.ds.Demo2;

public class Main2 {

	public static void main(String[] args) {
		Demo2.<String> printData("Hello Welcome");
		Demo2.<Circle> printData(new Circle(5));
		Demo2.<Integer> printData(Integer.valueOf(600));
		Demo2.<Employee> printData(new Employee());
		
		Demo2.printData("Hello Welcome");
		Demo2.printData(new Circle(5));
		Demo2.printData(Integer.valueOf(600));
		Demo2.printData(new Employee());
	}
}
