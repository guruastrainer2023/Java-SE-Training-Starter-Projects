package com.training.ui;

import java.util.List;
import java.util.Set;

import com.training.bean.Customer;

public class Main2 {

	public static void main(String[] args) {
		
		Customer c1=new Customer(1, "Apollo Pharmacy", 35000.00);
		Customer c2=new Customer(2, "MedPlus", 21788.00);
		
		List<Customer> customerList;
		customerList=List.of(
				c1,
				new Customer(2, "Green Pharmachy", 14000.33),
				c2
				);
		System.out.println(customerList);
	}

}
