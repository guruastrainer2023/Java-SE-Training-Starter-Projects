package com.training.ds;

public class Demo1 <T extends Number>{
	
	T obj;
	
	public void setData(T obj) {
		this.obj=obj;
	}
	
	public double getDoubleValue() {
		return this.obj.doubleValue();
	}

}
