package com.training.ui;

import com.training.bean.Circle;
import com.training.bean.Square;
import com.training.bean.ds.ObjectStackImpl2;

public class Main6 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(6);
		Square s1=new Square(7);
		String s2=new String("Welcome");
		Double d1=new Double(300.00);
		Boolean b1=new Boolean(true);
		
		ObjectStackImpl2 impl=new ObjectStackImpl2(10);
		impl.push(s1);
		impl.push(c1);
		
		impl.push(s2);
		impl.push(d1);
		impl.push(b1);
		
		Boolean popped=(Boolean) impl.pop();
		System.out.println(popped);
		
		impl.pop();
		impl.pop();
		impl.pop();
		
		Object obj=impl.pop();
		
		
		System.out.println(impl);

	}

}
