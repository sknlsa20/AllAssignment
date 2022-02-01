package com.src.map;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		
		TreeMap tm =new TreeMap((o1,o2)->(Integer)o1>(Integer)o2?-1:1);
		
		tm.put(121,"shiva");
		tm.put(678,"shiva");
		tm.put(126,"manoj");
		tm.put(95,"sukanya");
		tm.put(876,"balu");
		tm.put(432,"chinna");
		tm.put(333,"nothing");
		System.out.println(tm);
	}

}
