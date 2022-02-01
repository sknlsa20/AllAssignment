package com.col;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {


		PriorityQueue pq=new PriorityQueue();
		
		pq.add(567);
		pq.add(231);
		pq.add(111);
		pq.add(234);
		pq.add(345);
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		
		pq.poll();
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
		
		
		

	}

}
