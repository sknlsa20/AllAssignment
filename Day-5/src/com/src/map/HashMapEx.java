package com.src.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapEx {

	public static void main(String[] args) {


		HashMap<Integer,String> hm =new HashMap();
		
		
		hm.put(123,"sk");
		hm.put(456,"yk");
		hm.put(90,"kk");
		hm.put(333,"yk");
		hm.put(111,"pk");
		hm.put(456,"yk");// -> false
		System.out.println(hm);		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		
		LinkedHashMap<Integer,String> lhm =new LinkedHashMap();
		
		
		lhm.put(123,"sk");
		lhm.put(456,"yk");
		lhm.put(90,"kk");
		lhm.put(333,"yk");
		lhm.put(111,"pk");
		lhm.put(456,"yk");// -> false
		System.out.println(lhm);
		

	}

}
