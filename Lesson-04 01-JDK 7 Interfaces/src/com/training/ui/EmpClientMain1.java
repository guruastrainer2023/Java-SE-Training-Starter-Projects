package com.training.ui;

import com.training.bean.pack1.examples4.Employee;

public class EmpClientMain1 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("John");
		employee.setBasicSalary(10000.00);
		employee.setGrade('C');
		
		System.out.println(employee.getAllowance());
		System.out.println(employee.getDeduction());

	}

}
