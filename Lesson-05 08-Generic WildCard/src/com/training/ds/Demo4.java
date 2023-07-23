package com.training.ds;

import com.training.bean.Employee;

public class Demo4 {

	public static <T extends Employee> void printData(T t) {
		System.out.println(t.getNetSalary());
	}
}
