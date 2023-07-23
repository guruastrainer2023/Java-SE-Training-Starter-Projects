package com.training.ds;

import java.util.List;

import com.training.bean.Circle;
import com.training.bean.Employee;
import com.training.bean.Manager;
import com.training.bean.SalesExecutive;

public class Demo6 {
	// Client is Main06
	
	public static void printEmployeeData1(List<Employee> list) {
		list.add(new Manager(0));
		list.add(new SalesExecutive());
		for(Employee e: list) {
			System.out.println(e);
		}
		
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
	}
	
	public static void printEmployeeData2(List list) {
		list.add(new Manager(0));
		list.add(new SalesExecutive());
		list.add(new Circle(20));
		list.add("Hello");
		for(Object e: list) {
			System.out.println(e);
		}
		
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
	}
	
	// upper bounded wild card
	public static void printEmployeeData3(List<? extends Employee> list) {
		for(Employee e: list) {
			System.out.println(e);
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
	}

}
