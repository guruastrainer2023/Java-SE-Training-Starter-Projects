package com.training.ui;

import java.util.Date;

import com.training.bean.Employee;
import com.training.bean.Manager;

public class Main1 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(1001);
		emp.setName("Utkarsh");
		emp.setDateOfJoining(new Date());
		emp.setSalary(10000);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getDateOfJoining());
		System.out.println(emp.getSalary());
		System.out.println(emp.computeAllowance());
		
		

	}

}
