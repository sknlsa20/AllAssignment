package com.src;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		ServiceMethodClass sm =new ServiceMethodClass();
		Scanner name = new Scanner(System.in);
		
		System.out.println("enter a number :");
		
		int n=name.nextInt();
		Thread t1 = new Thread(()->sm.printTable(n));
		Thread t2 =new Thread(()->sm.printNvalues(n));
		
		t1.start();
		t2.start();
		
		

	}

}
