package com.training.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Manager;
import com.training.bean.SalesExecutive;
import com.training.ds.Demo6;

public class Main06 {

	public static void main(String[] args) {
		
		List<Employee> mylist1=new ArrayList<>();
		
		Employee e1=new Employee(101, "Rahul", 'A', LocalDate.now(), 10000, Gender.MALE);
		Employee e2=new Employee(102, "Payal", 'B', LocalDate.of(2014, 5, 10), 20000, Gender.FEMALE);
		Employee e3=new Employee(103, "Karthick", 'C', LocalDate.of(2015, 12, 15), 24000, Gender.MALE);
		
		mylist1.add(e1); mylist1.add(e2); mylist1.add(e3);
		
		Demo6.printEmployeeData3(mylist1);
		// ---------------------------------------------------------------------
		
		Manager m1=new Manager(104, "John", 'A', LocalDate.of(2020, 10, 24), 450000, Gender.MALE, 10);
		//mylist1.add(m1);
		Demo6.printEmployeeData3(mylist1);
		
		Manager m2=new Manager(105, "Jency", 'A', LocalDate.now(), 12000, Gender.FEMALE,14);
		
		List<Manager> myList2=new ArrayList<>();
		myList2.add(m1);
		myList2.add(m2);
		Demo6.printEmployeeData3(myList2);
		
		// ---------------------------------------------------------------------

		SalesExecutive s1=new SalesExecutive(106, "Victor", 'A', LocalDate.of(2014, 6, 16), 60000, Gender.MALE, 12);
		SalesExecutive s2=new SalesExecutive(107, "Tom", 'A', LocalDate.of(2014, 7, 18), 42000, Gender.MALE, 10);
		
		List<SalesExecutive> myList3=new ArrayList<>();
		myList3.add(s1); myList3.add(s2);
		Demo6.printEmployeeData3(myList3);
		
		// -----------------------------------------------------------------------------------

		Demo6.printEmployeeData1(mylist1);
		Demo6.printEmployeeData2(mylist1);
	}

}
