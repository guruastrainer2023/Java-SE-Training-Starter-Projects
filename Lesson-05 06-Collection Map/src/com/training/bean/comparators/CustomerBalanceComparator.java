package com.training.bean.comparators;

import java.util.Comparator;

import com.training.bean.Customer;

public class CustomerBalanceComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getBalance()<o2.getBalance())
			return -1;
		if(o1.getBalance()>o2.getBalance())
			return 1;
		return 0;
	}

}
