package com.training.ui;

import com.training.bean.ds.IntStackImpl;
import com.training.bean.ds.LongStackImpl;

public class Main3 {

	public static void main(String[] args) {
		byte v1=75;
		short v2=500;
		int v3=1000;
		
		long v4=97;
		double v5=88.0;
		
		
		LongStackImpl impl=new LongStackImpl(5);
		
		impl.push(v1);
		impl.push(v2);
		impl.push(v3);
		impl.push(v4);
		//impl.push(v5);
		
		System.out.println(impl);
		
		System.out.println(impl.pop());
		System.out.println(impl);

	}

}
