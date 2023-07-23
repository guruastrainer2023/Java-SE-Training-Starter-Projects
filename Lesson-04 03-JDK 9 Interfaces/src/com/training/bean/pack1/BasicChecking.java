package com.training.bean.pack1;

public class BasicChecking implements Accessible {

	@Override
	public double verifyDeposit(double amt, int pin) {
		// your additional code here
		Accessible.super.verifyDeposit(amt, pin);
		// your additional code here
		return 0;
	}

	@Override
	public double verifyWithdraw(double amt, int pin) {
		// your additional code here
		Accessible.super.verifyWithdraw(amt, pin);
		// your additional code here
		return 0;
	}

}
