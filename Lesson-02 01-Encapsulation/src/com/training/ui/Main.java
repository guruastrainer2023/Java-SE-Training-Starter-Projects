package com.training.ui;

import java.util.Date;

import com.training.bean.Employee;

public class Main {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId= 1001;
		emp.name= "Utkarsh";
		emp.dateOfJoining=new Date(0);
		emp.salary=10000;
		
		System.out.println(emp.empId);
		System.out.println(emp.name);
		System.out.println(emp.dateOfJoining);
		System.out.println(emp.salary);

	}

}
