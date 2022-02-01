package com.src.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingEx {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList();

		al.add(34);
		al.add(56);
		al.add(23);
		al.add(17);
		al.add(90);
		
		
		List<Integer> l = al.stream().sorted((m1,m2)->m1>m2?-1:1).collect(Collectors.toList());
		
		System.out.println(l);
		
		
		ArrayList<String> al1 =new ArrayList();

		al1.add("shiva");
		al1.add("prakash");
		al1.add("habeeb");
		al1.add("mounika");
		al1.add("prathima");
		
		
		List<String> ls = al1.stream().sorted((m1,m2)->m1.compareTo(m2)>0?-1:1).collect(Collectors.toList());
		
		System.out.println(ls);

	}

}
