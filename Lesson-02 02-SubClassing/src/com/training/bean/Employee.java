package com.training.bean;

import java.util.Date;

public class Employee {
	private int empId;
	private String name;
	private Date dateOfJoining;
	private double salary;
	
	public Employee() {
		super();
		
	}
	
	

	public Employee(int empId, String name, Date dateOfJoining, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double computeAllowance() {
		return this.salary*0.25;
	}
	
	

}
