package com.src;

public class ServiceMethodClass {
	
	public void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" X "+i+" = "+(n*i));
		}
	}
	
	
	public void printNvalues(int n)
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
