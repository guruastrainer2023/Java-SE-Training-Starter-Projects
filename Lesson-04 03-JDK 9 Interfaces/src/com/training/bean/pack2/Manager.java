package com.training.bean.pack2;

public class Manager implements Employee {
	private int id;
	private String name;
	private double basicSalary;
	private int employeeCount;
	
	

	public Manager(int id, String name, double basicSalary, int employeeCount) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.employeeCount = employeeCount;
	}

	
	public Manager() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public double computeAllowance() {
		double hra_percent=0.40;
		double travelAllowanceAmount=5000.00;
		double result=this.basicSalary*hra_percent+travelAllowanceAmount;
		result=result+(employeeCount*500);
		return result;
	}

	@Override
	public double computeDeduction() {
		double taxpercent=0.10;
		double pfpercent=this.basicSalary*0.07;
		return this.basicSalary-(this.basicSalary*taxpercent)-(this.basicSalary*pfpercent);
	}

	@Override
	public double getNetSalary() {
		double result=this.computeAllowance()-this.computeAllowance()+this.basicSalary;
		return result;
	}
	
	@Override
	public void printDetails() {
		
		Employee.super.printDetails();
		System.out.println("EMPLOYEE COUNT : "+ this.employeeCount);
	}

}
