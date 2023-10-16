package com.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertvalue {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DriverLoad Sucess");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","Nopass@123");
			System.out.println("Connection Sucess");
			
			Statement s=con.createStatement();
			System.out.println("Statement created");
			
			int r=s.executeUpdate("insert into shubham value(55,'Shivani',25)");
			int b=s.executeUpdate("insert into shubham value(22,'Nat',55)");
			int a=s.executeUpdate("insert into shubham value(10,'Yash',35)");
			int c=s.executeUpdate("insert into shubham value(50,'Colt',02)");
			
			System.out.println("Insert Sucessfull");
			
			s.close();
			con.close();
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
