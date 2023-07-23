package com.training.bean;

import java.util.Date;

public class Manager extends Employee{
	
	private int employeeCount;

	public Manager() {
		super();
	}

	public Manager(int empId, String name, Date dateOfJoining, double salary, int employeeCount) {
		super(empId, name, dateOfJoining, salary);
		this.employeeCount = employeeCount;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	
	@Override
	public double computeAllowance() {
		return super.computeAllowance()+(this.employeeCount*1000);
	}

	@Override
	public String toString() {
		return "Manager [employeeCount=" + employeeCount + "]";
	}
	
	

}
