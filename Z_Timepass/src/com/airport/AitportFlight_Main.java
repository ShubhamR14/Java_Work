package com.airport;

import java.time.LocalTime;
import java.util.Scanner;

public class AitportFlight_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Airport_FlightTime plane=new Airport_FlightTime("Kingfisher	,sc.next(),sc.next());
		System.out.println(plane.toString());
		

	}

}
