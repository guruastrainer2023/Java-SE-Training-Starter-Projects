package com.training.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Manager;
import com.training.bean.RegionalManager;
import com.training.ds.Demo7;
import com.training.ds.Demo8;
import com.training.ds.Demo9;

public class Main10 {

	public static void main(String[] args) {
		List<Employee> mylist1=new ArrayList<>();
		
		Employee e1=new Employee(101, "Rahul", 'A', LocalDate.now(), 10000, Gender.MALE);
		Employee e2=new Employee(102, "Payal", 'B', LocalDate.of(2014, 5, 10), 20000, Gender.FEMALE);
		Employee e3=new Employee(103, "Karthick", 'C', LocalDate.of(2015, 12, 15), 24000, Gender.MALE);
		
		mylist1.add(e1); mylist1.add(e2); mylist1.add(e3);
		
		Demo9.printData(mylist1);
		// ---------------------------------------------------------------------
		
		Manager m1=new Manager(104, "John", 'A', LocalDate.of(2020, 10, 24), 450000, Gender.MALE, 10);
		Manager m2=new Manager(105, "Jency", 'A', LocalDate.now(), 12000, Gender.FEMALE,14);
		
		List<Manager> myList2=new ArrayList<>();
		myList2.add(m1);
		myList2.add(m2);
		
		Demo9.printData(myList2);
		// ---------------------------------------------------------------------

		RegionalManager rm1=new RegionalManager(106, "Amit", 'A', LocalDate.of(2014, 12, 10), 200000, Gender.MALE, 120, 10);
		RegionalManager rm2=new RegionalManager(107, "Meena", 'A', LocalDate.of(2016, 02, 24), 100000, Gender.FEMALE, 90, 5);

		List<RegionalManager> myList3=new ArrayList<>();
		
		Demo9.printData(myList3); 
	}

}
