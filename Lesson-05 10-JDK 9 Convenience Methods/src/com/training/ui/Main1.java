package com.training.ui;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		
		String s1=new String("hello");
		List<String> list1=List.of(
				"hello",
				"welcome",
				"HTML",
				"World",
				null,
				"welcome",
				s1,
				s1
				);
		
		System.out.println(list1);
	}

}
