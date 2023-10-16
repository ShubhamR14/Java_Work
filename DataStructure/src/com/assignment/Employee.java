package com.assignment;

public class Employee implements Comparable<Employee> {
	
	private int rollNum;
	private String Name;
	private int age;
	
	public int compareTo(Employee o) {
		return this.age-o.age;
	}
	

	public Employee(int rollNum, String name, int age) {
		super();
		this.rollNum = rollNum;
		Name = name;
		this.age = age;
	}



	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [rollNum=" + rollNum + ", Name=" + Name + ", age=" + age + "]";
	}
	
	
	
	
}
