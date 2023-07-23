package com.training.bean.pack1.examples1;

public abstract class  Loan {
	private String customerName;
	private double loanAmount;
	private int loanTenure;
	
	public Loan(String customerName, double loanAmount, int loanTenure) {
		super();
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	@Override
	public String toString() {
		return "Loan [customerName=" + customerName + ", loanAmount=" + loanAmount + ", loanTenure=" + loanTenure + "]";
	}
	
	public abstract double getInterestRate();
	
	public double getInterestAmount() {
		return this.loanAmount*this.loanTenure*this.getInterestRate();
	}
	public double getTotalRepayable() {
		return this.loanAmount+ this.getInterestAmount();
	}
	public double getEMI() {
		return this.getTotalRepayable()/this.loanTenure;
	}

}
