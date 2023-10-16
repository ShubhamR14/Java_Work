package com.jdbc_connectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded");
				
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","Nopass@123");
			System.out.println("Connection");
			
			Statement s=con.createStatement();
			System.out.println("Statement created sucessfully");
					
			boolean flag=s.execute("create table shubham ( rollnumber int primary key,name varchar(30),marks float(10,2))");
			System.out.println("Table created");
			
			s.close();
			con.close();
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
		
		
		
		
	}

}
