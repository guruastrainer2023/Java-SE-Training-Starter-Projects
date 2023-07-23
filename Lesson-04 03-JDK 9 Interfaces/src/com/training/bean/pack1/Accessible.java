package com.training.bean.pack1;

public interface Accessible {
	double OVERDRAFT_FEE=25;
	default double verifyDeposit(double amt, int pin) {
		verifyTransaction(amt, pin);
		return 0;
	}
	default double verifyWithdraw(double amt, int pin) {
		verifyTransaction(amt, pin);
		// verify that balance does not become negative 
		return 0;
	}
	
	private boolean verifyTransaction(double amt, int pin) {
		// verify the pin
		// verify that amt is greater than zero
		return true;
	}
	
}
