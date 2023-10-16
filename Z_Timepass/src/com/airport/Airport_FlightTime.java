package com.airport;

import java.time.LocalDateTime;

public class Airport_FlightTime {
	public String Fname;
	public String time;
	public String Aname;

	public Airport_FlightTime() {
		System.out.println("This is Defalut Constructor");
	}

	public Airport_FlightTime(String fname, String time, String aname) {
		Fname = fname;
		this.time = time;
		Aname = aname;
	
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	@Override
	public String toString() {
		return "Airport_FlightTime [Fname=" + Fname + ", time=" + time + ", Aname=" + Aname + "]";
	}
	
}
