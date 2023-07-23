package com.training.bean.pack2;

public interface Employee {
	
	int MINIMUM_AGE=18;
	
	int getId();
	String getName();
	double getBasicSalary();
	
	/*private int getMinimumAge() {
		 return MINIMUM_AGE;
	}*/

	
	default void printDetails() {
		System.out.println("ID : "+ getId());
		System.out.println("NAME : "+ getName());
		System.out.println("BASIC SALARY : "+ getBasicSalary());
		//System.out.println("MINIMUM AGE : "+ getMinimumAge());
	}
	
	double computeAllowance();
	double computeDeduction();
	double getNetSalary();

}
