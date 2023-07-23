package com.training.ui;

import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		Set<Integer> set = Set.of(Integer.valueOf(100), 200, 300, Integer.valueOf(400));

		for (Integer i : set) {
			System.out.println(i);
		}
	}

}
