package com.training.bean;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;

	public Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public double computeAllowance() {
		return 0.0;
	}

	public double computeDeduction() {
		return 0.0;
	}

	public double computeNetSalary() {
		return 0.0;
	}

	public class Calculator {
		public double add(double a, double b) {
			return a + b;
		}

		public double subtract(double a, double b) {
			return a - b;
		}

		public double multiply(double a, double b) {
			return a * b;
		}

		public double divide(double a, double b) {
			return a / b;
		}
	}

}
