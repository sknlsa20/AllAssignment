package com.src.map;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
public class StreamEx2 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		HashSet hs=new HashSet();
		
		System.out.println("enter number of values to be accepted");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter elements");
			
			int j =sc.nextInt();
			hs.add(j);
		}
		
		System.out.println(hs);
		
		Set s = (Set) hs.stream().map((m)->(Integer)m*(Integer)m).collect(Collectors.toSet());
		
		System.out.println(s);
		
		

	}

}
