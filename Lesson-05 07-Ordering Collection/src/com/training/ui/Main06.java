package com.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.training.bean.Rectangle;
import com.training.bean.comparators.RectangleHeightComparator;

public class Main06 {

	public static void main(String[] args) {
		RectangleHeightComparator comparator=new RectangleHeightComparator();
		
		Set<Rectangle> myset=new TreeSet<>(comparator);
		
		myset.add(new Rectangle(1000, 200));
		myset.add(new Rectangle(100, 50));
		
		System.out.println(myset);

	}

}
