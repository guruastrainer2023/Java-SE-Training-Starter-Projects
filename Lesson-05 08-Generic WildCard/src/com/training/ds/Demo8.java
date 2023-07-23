package com.training.ds;

import java.util.List;

import com.training.bean.Manager;
import com.training.bean.RegionalManager;

public class Demo8 {
	
			// Client is Main08

		    // Lower Bounded Wild Card
			public static void printData(List<? super Manager> list) {
				for(Object i: list) {
					System.out.println(i);
				}
			}
}
