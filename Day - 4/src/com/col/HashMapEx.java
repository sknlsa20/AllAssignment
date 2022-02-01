package com.col;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashSet hm = new HashSet();
		
		hm.add(234);
		hm.add(768);
		hm.add(900);
		hm.add(345);
		hm.add(234); //false -> equals() 
		
		System.out.println(hm);
		
		LinkedHashSet lhs =new LinkedHashSet();
		
		lhs.add(234);
		lhs.add(768);
		lhs.add(900);
		lhs.add(345);
		lhs.add(234);
		
		System.out.println(lhs);
		
		
		
		

	}

}
