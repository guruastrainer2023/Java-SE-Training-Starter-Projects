package com.training.ui;

import java.util.List;
import java.util.Set;

import com.training.bean.Circle;

public class Main2 {

	public static void main(String[] args) {
		Circle c1=new Circle(50);
		Circle c2=new Circle(3);
		List<Circle> circles=List.of(
				c1,
				new Circle(10),
				new Circle(4),
				new Circle(14),
				new Circle(12),
				c2
				);
		
		for(Circle c:circles) {
			System.out.println(c.computeArea());
		}
	}

}
