package com.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		Collection c = new ArrayList();//dynamic binding
		
		System.out.println(c.isEmpty());
		c.add(45);
		c.add(78);
		c.add(90);
		System.out.println(c);
		
		ArrayList al = new ArrayList();
		al.add(56);
		al.add(23);
		al.add(89);
		
		c.addAll(al);
		System.out.println(c);
		
		Iterator it=c.iterator();
		
		while(it.hasNext())
		{
			if((Integer)it.next()%2==0)
			{
				System.out.println("it is even number");
			}
			else
			{
				System.out.println("it is odd number");
			}
		}

	}

}
