package com.src;

public class Thread1 extends Thread{
	@Override
	public void run()
	{
		for(int i=0;i<26;i++)
		{
			System.out.println("thread 1 : "+i);
		}
	}

}


class Thread2 extends Thread{
	
	@Override
	public void run()
	{
		for(int i=25;i<51;i++)
		{
			System.out.println("thread 2 : "+i);
		}
	}
}


class Runnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=51;i<76;i++)
		{
			System.out.println("thread 3 : "+i);
			
			throw new ArithmeticException();
		}
		
	}
	
	
}


class Runnable2 implements Runnable{

	@Override
	public void run() {
		for(int i=75;i<101;i++)
		{
			System.out.println("thread 4 : "+i);
		}
		
	}
	
	
}
