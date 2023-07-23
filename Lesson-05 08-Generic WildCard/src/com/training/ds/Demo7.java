package com.training.ds;

import java.util.List;
import com.training.bean.Manager;

public class Demo7 {
	// Client is Main 07
	
	// Lower Bounded Wild Card
	public static void printData(List<? super Integer> list) {
		for(Object i: list) {
			System.out.println(i);
		}
	}
	
	
}
