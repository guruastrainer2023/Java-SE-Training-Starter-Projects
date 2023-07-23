package com.training.bean;

public class Circle {
	
	private int radius;
	
	

	public Circle() {
		super();
	
	}



	public Circle(int radius) {
		super();
		this.radius = radius;
	}



	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	

}
