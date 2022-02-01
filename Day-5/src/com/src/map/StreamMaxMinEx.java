package com.src.map;

import java.util.ArrayList;
import java.util.Optional;

public class StreamMaxMinEx {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList();

		al.add(34);
		al.add(56);
		al.add(23);
		al.add(17);
		al.add(90);
		
		Optional<Integer> mx = al.stream().max((m1,m2)->m1>m2?-1:1);
		
		System.out.println(mx);
		
		
		Optional<Integer> mi = al.stream().min((m1,m2)->m1>m2?-1:1);
		System.out.println(mi);
		
		
		long l = al.stream().filter((m)->m<35).count();
		System.out.println("No of students who failied is "+l);
		
		
	}

}
