package com.training.ui;

import com.training.bean.CarLoan;
import com.training.bean.Loan;
import com.training.bean.PersonalLoan;

public class Main1 {

	public static void main(String[] args) {
		
		Loan loan;
		
		loan=new CarLoan(400000, 36);
		System.out.println(loan.getLoanType());
		System.out.println(loan.getInterestAmount());
		System.out.println(loan.getEMI());
		
		loan=new PersonalLoan(400000, 36);
		
		System.out.println(loan.getLoanType());
		System.out.println(loan.getInterestAmount());
		System.out.println(loan.getEMI());
		

	}

}
