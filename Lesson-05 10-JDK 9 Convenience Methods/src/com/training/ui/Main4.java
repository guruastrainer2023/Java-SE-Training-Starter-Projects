package com.training.ui;

import java.util.Map;

public class Main4 {

	public static void main(String[] args) {
		Map<String, Double> map;
		map=Map.of(
				"One", 200.00,
				"Two", 300.00,
				"Three", 400.00,
				"One", 500.00
			);
		System.out.println(map);
	}

}
