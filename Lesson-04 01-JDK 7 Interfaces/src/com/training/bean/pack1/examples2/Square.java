package com.training.bean.pack1.examples2;

public class Square {
	private int size;

	public Square(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	
	public void setSize(int size) {
		this.size = size;
	}
	
	public double computeArea() {
		return this.size*this.size;
	}

	
	

}
