package com.col;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {

	public static void main(String[] args) {
		
		ArrayBlockingQueue abq=new ArrayBlockingQueue(10);
		
		for(int i=0;i<10;i++)
		{
			abq.add(i);
		}
		System.out.println(abq);
		
			abq.poll();
			
			System.out.println(abq);
			
			abq.add(10);
			System.out.println(abq);
			
		

	}

}
