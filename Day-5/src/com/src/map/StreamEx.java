package com.src.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {


			ArrayList<Integer> al =new ArrayList();
			
			al.add(34);
			al.add(56);
			al.add(23);
			al.add(17);
			al.add(90);
			
			System.out.println(al);
			
			/* tell me each arraylist object is even or odd
			 * if it is odd separte them in another collection object
			 */
			
			Iterator it = al.iterator();
			ArrayList al1=new ArrayList();
			
			while(it.hasNext())
			{
				Integer n = (Integer)it.next();
				if(n%2==0)
				{
					al1.add(n);
				}
				
			}
			
			System.out.println(al1);
			
			
			
			
			
			ArrayList<Integer> l = (ArrayList<Integer>) al.stream().filter((m)->m%2==0).collect(Collectors.toList());
			
			System.out.println(l);
			
			
			

	}

}
