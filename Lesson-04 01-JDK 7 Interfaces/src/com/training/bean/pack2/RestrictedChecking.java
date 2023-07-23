package com.training.bean.pack2;

public class RestrictedChecking implements Accessible{

	@Override
	public double verifyDeposit(double amt, int pin) {
		// verify the pin
		// verify that amt is greater than zero
		return 0;
	}

	@Override
	public double verifyWithdraw(double amt, int pin) {
		// verify the pin
		// verify that amt is greater than zero
		// verify that balance does not become negative 
		// verify that the withdraw amount is under transaction limit 
		return 0;
	}

}
