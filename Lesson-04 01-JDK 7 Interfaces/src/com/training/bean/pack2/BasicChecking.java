package com.training.bean.pack2;

public class BasicChecking implements Accessible {

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
		return 0;
	}

}
