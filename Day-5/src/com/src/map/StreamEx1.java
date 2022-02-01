package com.src.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList();

		al.add(34);
		al.add(56);
		al.add(23);
		al.add(17);
		al.add(90);
		
		
			List l = al.stream().map((x)->x+10).collect(Collectors.toList());
			
			System.out.println(l);
		
		
		
		

	}

}
