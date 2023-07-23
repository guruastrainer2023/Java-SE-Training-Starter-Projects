package com.training.ui;

import java.time.LocalDate;

import com.training.bean.Gender;
import com.training.bean.Manager;
import com.training.bean.SalesExecutive;
import com.training.ds.Demo2;

public class Main02 {

	public static void main(String[] args) {
		Demo2<Manager> d1=new Demo2<>();
		d1.setData(new Manager(102, "Rahul", 'A', LocalDate.now(), 10000, Gender.MALE));
		d1.printDetails();
		
		SalesExecutive executiveEmp=new SalesExecutive(103, "Karthik", 'B', LocalDate.now(), 100000, Gender.FEMALE, 4);
		
		Demo2<SalesExecutive> d2=new Demo2<>();
		d2.setData(executiveEmp);
		d2.printDetails();
		

	}

}
