package com.training.bean;

public class PersonalLoan implements Loan{
	
	double loanAmount;
	int tenure;
	
	
	public PersonalLoan(double loanAmount, int tenure) {
		super();
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}

	@Override
	public String getLoanType() {
		
		return "Personal Loan";
	}

	@Override
	public double getInterestAmount() {
		
		return this.loanAmount*0.11;
	}

	@Override
	public double getEMI() {
		
		return (this.loanAmount+this.getInterestAmount())/this.tenure;
	}
}
