package com.col;

import java.util.HashSet;

import com.model.Student;

public class HashSetObjectEx {

	public static void main(String[] args) {
		
		HashSet hs =new HashSet();
		
		hs.add(new Student(45,"pk",21));
		hs.add(new Student(67,"gk",27));
		hs.add(new Student(21,"mk",31));
		hs.add(new Student(90,"nk",21));
		hs.add(new Student(45,"pk",21));
		
		System.out.println(hs);
		
		

	}

}
