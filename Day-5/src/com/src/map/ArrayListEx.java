package com.src.map;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {


		ArrayList al =new ArrayList();
		
		al.add("34");
		al.add(34);
		al.add('a');
		al.add(34.5);
		
		System.out.println(al);
		
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
