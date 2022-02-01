package com.col;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new MyComparator());
		
		ts.add(456);
		ts.add(212);
		ts.add(768);		
		ts.add(345);
		ts.add(789);
		
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(456));
		System.out.println(ts.tailSet(456));		
				
		System.out.println(ts.headSet(456, true));
		
		
		

	}

}
