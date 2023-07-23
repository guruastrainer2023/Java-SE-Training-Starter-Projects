package com.training.ds;

import java.util.List;

import com.training.bean.Employee;

public class Demo9 {
	
	// Client is Main09 and Main10
	
	// Unbounded Wild Card
	public static void printData(List<?> list) {
		for(Object o: list) {
			System.out.println(o);
		}
		
	}
}
