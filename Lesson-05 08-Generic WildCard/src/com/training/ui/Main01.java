package com.training.ui;

import com.training.ds.Demo1;

public class Main01 {

	public static void main(String[] args) {
		
		Demo1<Integer> d1=new Demo1<>();
		d1.setData(Integer.valueOf(200));
		System.out.println(d1.getDoubleValue());
		
		Demo1<Long> d2=new Demo1<>();
		d2.setData(Long.valueOf(500));
		System.out.println(d2.getDoubleValue());
		
		Demo1<Double> d3=new Demo1<>();
		d3.setData(Double.valueOf(7000.00));
		System.out.println(d3.getDoubleValue());

	}

}
