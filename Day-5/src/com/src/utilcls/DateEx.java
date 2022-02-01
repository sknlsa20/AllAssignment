package com.src.utilcls;

import java.util.Calendar;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		Date d =new Date();
		
		System.out.println(d);
		
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getTime());
		
		System.out.println(d.getYear());
		
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());
		
		c.add(Calendar.DATE, -15);
		
		System.out.println(c.getTime());
		
		c.add(Calendar.MONTH, 4);
		
		System.out.println(c.getTime());
	}

}
