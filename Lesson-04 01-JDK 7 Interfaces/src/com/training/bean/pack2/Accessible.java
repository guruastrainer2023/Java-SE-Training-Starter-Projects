package com.training.bean.pack2;

public interface Accessible {
	double OVERDRAFT_FEE=25;
	double verifyDeposit(double amt, int pin);
	double verifyWithdraw(double amt, int pin);
	
}
