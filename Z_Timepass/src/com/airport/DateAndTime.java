package com.airport;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {

	public static void main(String[] args) {
//		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		LocalDate l=LocalDate.of(2000,Month.APRIL,01);
		System.out.println(l);
	
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
	}
	
}
