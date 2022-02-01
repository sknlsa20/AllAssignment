package com.src;

public class TaskOrientedEx {

	public static void main(String[] args) {
		
		TaskOrientedEx o =new TaskOrientedEx();
		o.display1_25();
		o.display25_50();
		o.display51_75();
		o.display75_100();

	}
	
	public void display1_25()
	{
		for(int i=0;i<26;i++)
		{
			System.out.println("process 1 : "+i);
		}
	}
	public void display25_50()
	{
		for(int i=25;i<51;i++)
		{
			System.out.println("process 2 : "+i);
			throw new ArithmeticException();
		}
	}
	public void display51_75()
	{
		for(int i=51;i<76;i++)
		{
			System.out.println("process 3 : "+i);
		}
	}
	public void display75_100()
	{
		for(int i=75;i<101;i++)
		{
			System.out.println("process 4 : "+i);
		}
	}

}
