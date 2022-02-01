package com.col;

import java.util.TreeSet;

import com.model.Student;

public class TreeSetObjectEx {

	public static void main(String[] args) {
		
		TreeSet ts =new TreeSet((t1,t2)->((Student)t1).getStdid() > ((Student)t2).getStdid()?-1:1);
		
		ts.add(new Student(34,"pk",21));
		ts.add(new Student(45,"gk",32));
		ts.add(new Student(21,"kk",27));
		ts.add(new Student(56,"mk",21));
		
		System.out.println(ts);

	}

}
