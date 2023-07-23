package com.training.ui;

import com.training.bean.Circle;
import com.training.bean.Employee;
import com.training.bean.ds.Demo1;

public class Main1 {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		
		d1.<String> printData("hello");
		d1.<Integer> printData(Integer.valueOf(100));
		d1.<Circle> printData(new Circle(400));
		d1.<Employee> printData(new Employee());

	}

}
