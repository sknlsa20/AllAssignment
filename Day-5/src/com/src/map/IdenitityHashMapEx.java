package com.src.map;

import java.util.IdentityHashMap;

public class IdenitityHashMapEx {

	public static void main(String[] args) {

		IdentityHashMap hm =new IdentityHashMap();
		
		String str = "shiva";
		String str1 = "shiva";
		
		
		String str2 = new String("shiva");
		System.out.println(str==str1);//true
		
		System.out.println(str==str2); // false
		
		
		hm.put(str, "pk");
		hm.put(str1, "mk");
		hm.put(str2, "gk");
		
		
		System.out.println(hm);
	}

}
