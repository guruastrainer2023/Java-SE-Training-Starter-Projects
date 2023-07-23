package com.training.bean.comparators;

import java.util.Comparator;

import com.training.bean.Rectangle;

public class RectangleHeightComparator implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		if(o1.getHeight()<o2.getHeight())
			return -1;
		if(o1.getHeight()>o2.getHeight())
			return 1;
		return 0;
	}

}
