package com.training.ui;

import java.time.LocalDate;

import com.training.bean.Gender;
import com.training.bean.Manager;
import com.training.bean.SalesExecutive;
import com.training.ds.Demo4;

public class Main04 {

	public static void main(String[] args) {
		
		Demo4.<Manager> printData(new Manager(101, "Rahul", 'A', LocalDate.now(), 10000, Gender.MALE, 10));
		Demo4.<SalesExecutive> printData(new SalesExecutive(102, "Karthick", 'B', LocalDate.now(),10000.00,Gender.MALE,  10));
		

	}

}
