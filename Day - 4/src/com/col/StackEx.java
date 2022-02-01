package com.col;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {


		Stack s = new Stack();
		s.add(345);
		s.add(456);
		s.add(112);
		s.add(90);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
	}

}
