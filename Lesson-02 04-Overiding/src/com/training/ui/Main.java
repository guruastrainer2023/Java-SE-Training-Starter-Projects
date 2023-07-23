package com.training.ui;

import java.util.Date;

import com.training.bean.Employee;
import com.training.bean.Manager;

public class Main {

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
		
		Manager mngr=new Manager(1001, "Sanjay", new Date(), 10000, 10);
		System.out.println(mngr.getEmpId());
		System.out.println(mngr.getName());
		System.out.println(mngr.getDateOfJoining());
		System.out.println(mngr.getSalary());
		System.out.println(mngr.computeAllowance());

	}

}
