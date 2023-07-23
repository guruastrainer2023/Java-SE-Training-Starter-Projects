package com.training.bean.pack3;

public class Accountant implements Employee{
	
	private int id;
	private String name;
	private double basicSalary;
	private String location;
	
	

	public Accountant() {
		super();
	}

	public Accountant(int id, String name, double basicSalary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public double computeAllowance() {
		double hra_percent=0.40;
		double travelAllowanceAmount=5000.00;
		double result=this.basicSalary*hra_percent+travelAllowanceAmount;
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

}
