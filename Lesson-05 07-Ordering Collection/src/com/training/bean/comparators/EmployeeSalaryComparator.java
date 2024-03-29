package com.training.bean.comparators;

import java.util.Comparator;

import com.training.bean.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getBasicSalary()<o2.getBasicSalary())
			return -1;
		if(o1.getBasicSalary()>o2.getBasicSalary())
			return 1;
		return 0;
	}

}
