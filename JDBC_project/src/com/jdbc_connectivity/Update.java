package com.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","Nopass@123");
			System.out.println("Connection sucess");
			
			Statement s=con.createStatement();
			System.out.println("Statement create");
			
			int sh=s.executeUpdate("update shubham set name='NitaBear' where marks=55 ");
			int si=s.executeUpdate("update shubham set name='BeastBetro' where marks=25 ");
			int k=s.executeUpdate("update shubham set name='Yati' where name='yash'");
			System.out.println("Update Sucess");
			
			s.close();
			con.close();
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
