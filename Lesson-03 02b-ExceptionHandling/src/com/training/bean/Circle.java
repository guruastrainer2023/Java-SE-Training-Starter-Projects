package com.training.bean;

import java.util.Objects;

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



	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}
	
	

}
