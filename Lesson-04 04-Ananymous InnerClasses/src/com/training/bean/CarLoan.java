package com.training.bean;

public class CarLoan implements Loan{
	
	double loanAmount;
	int tenure;
	
	
	

	public CarLoan(double loanAmount, int tenure) {
		super();
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}

	@Override
	public String getLoanType() {
		
		return "Car Loan";
	}

	@Override
	public double getInterestAmount() {
		
		return this.loanAmount*0.15;
	}

	@Override
	public double getEMI() {
		
		return (this.loanAmount+this.getInterestAmount())/this.tenure;
	}

}
