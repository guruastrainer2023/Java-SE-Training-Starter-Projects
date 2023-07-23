package com.training.bean.pack1;

public interface Accessible {
	double OVERDRAFT_FEE=25;
	default double verifyDeposit(double amt, int pin) {
		// verify the pin
		// verify that amt is greater than zero
		return 0;
	}
	default double verifyWithdraw(double amt, int pin) {
		// verify the pin
		// verify that amt is greater than zero
		// verify that balance does not become negative 
		return 0;
	}
	
}
