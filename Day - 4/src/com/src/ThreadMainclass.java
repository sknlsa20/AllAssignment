package com.src;

public class ThreadMainclass {

	public static void main(String[] args) {


			Thread1 t1=new Thread1();// this is thread object
			Thread2 t2=new Thread2();// this is thread object
			
			Runnable1 r1 = new Runnable1();//normal object
			
			Thread t3 = new Thread(r1);// this is thread object
			
			Thread t4= new Thread(new Runnable2());// this is thread object
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();

	}

}
