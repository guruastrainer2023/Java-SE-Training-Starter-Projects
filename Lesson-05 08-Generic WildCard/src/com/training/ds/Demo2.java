package com.training.ds;

import com.training.bean.Employee;

public class Demo2 <T extends Employee>{
	
	T object;
	
	public void setData(T obj) {
		this.object=obj;
	}
	
	public void printDetails() {
		System.out.println("Name	: "+this.object.getName());
		System.out.println("Basic Salary : "+this.object.getBasicSalary());
		System.out.println("Allowance    : "+this.object.computeAllowance());
		System.out.println("Net Salary   : "+this.object.getNetSalary());
	}

}
