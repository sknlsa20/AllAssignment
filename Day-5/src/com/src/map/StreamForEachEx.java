package com.src.map;

import java.util.ArrayList;

public class StreamForEachEx {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList();

		al.add(34);
		al.add(56);
		al.add(23);
		al.add(17);		
		al.add(90);
		
		al.stream().forEach((m)->System.out.println(m));
		
		
	}

}
