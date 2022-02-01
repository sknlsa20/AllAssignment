package com.src.utilcls;

import java.time.LocalDate;

public class DateTimeEx {

	public static void main(String[] args) {

		LocalDate date=LocalDate.now();
		
		System.out.println(date);
		
		LocalDate date1=date.minusDays(15);
		System.out.println(date1);

	}

}
