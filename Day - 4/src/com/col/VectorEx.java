package com.col;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector c = new Vector();
		
		c.add(789);
		c.add(989);
		c.add(234);
		c.add(789);
		c.add(null);
		System.out.println(c);
		
		Enumeration e = c.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		

	}

}
