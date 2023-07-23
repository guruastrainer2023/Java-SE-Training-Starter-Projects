package com.training.ui;

import java.util.Map;
import java.util.Set;

public class Main5 {

	public static void main(String[] args) {
		
		Map.Entry<String, Integer> entry1=Map.entry("Four", 600);
		Map.Entry<String, Integer> entry2=Map.entry("Five", 700);
		
		
		Map<String, Integer> map;
		map=Map.ofEntries(
				Map.entry("One", Integer.valueOf(300)),
				Map.entry("two", Integer.valueOf(400)),
				Map.entry("three", 500),
				entry1,
				entry2
		);
		
		Set<String> allKeys=map.keySet();
		for(String eachKey:allKeys) {
			System.out.println(eachKey+ " - "+ map.get(eachKey));
		}
	}

}
