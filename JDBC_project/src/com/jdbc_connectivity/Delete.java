package com.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","Nopass@123");
			System.out.println("Connection sucess");
			
			Statement s=con.createStatement();
			System.out.println("Statement create");
			
			int u=s.executeUpdate("delete from shubham where marks=2");
			System.out.println("Delete sucess");
			
			s.close();
			con.close();	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
