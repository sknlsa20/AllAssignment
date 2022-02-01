package com.col;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		
		List ll = new LinkedList();
		
		ll.add(456);
		ll.add(23);
		
		System.out.println(ll);
		
		ListIterator li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
	}

}
