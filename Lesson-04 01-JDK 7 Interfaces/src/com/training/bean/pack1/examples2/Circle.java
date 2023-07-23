package com.training.bean.pack1.examples2;

public class Circle {
	private int radius;

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
	
	public double calculateArea() {
		return 3.14*(this.radius*this.radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	

	
	
}
