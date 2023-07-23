package com.training.ui;

import java.util.Map;
import java.util.Set;

import com.training.bean.Circle;

public class Main6 {

	public static void main(String[] args) {
		Circle c1=new Circle(10);
		Circle c2=new Circle(30);
		
		Map<String, Circle> circleMap;
		
		circleMap=Map.of(
					"Small", c1,
					"Big", c2,
					"Medium", new Circle(20)
				  );
		
		Set<String> allKeys=circleMap.keySet();
		for(String eachKeyStr: allKeys) {
			System.out.println(eachKeyStr+" - "+ circleMap.get(eachKeyStr));
		}
		

	}

}
