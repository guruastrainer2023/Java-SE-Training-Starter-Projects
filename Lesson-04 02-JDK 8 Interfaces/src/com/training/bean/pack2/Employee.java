package com.training.bean.pack2;

public interface Employee {
	
	int MINIMUM_AGE=18;
	
	int getId();
	String getName();
	double getBasicSalary();

	
	/*default void printDetails() {
		System.out.println("ID : "+ getId());
		System.out.println("NAME : "+ getName());
		System.out.println("BASIC SALARY : "+ getBasicSalary());
	}*/
	
	double computeAllowance();
	double computeDeduction();
	double getNetSalary();

}
