package com.col;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer number1=(Integer)o1;
		Integer number2=(Integer)o2;	
		
		return number1>number2?-1:1;
	}

}
