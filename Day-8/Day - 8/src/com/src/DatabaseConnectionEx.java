package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionEx {

	public static void main(String[] args) {
		Connection con=null; //java.sql
		Statement stmt=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // step 1			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivadb","root","root"); // step 2			
			stmt= con.createStatement(); // step 3
			
			
			int i=stmt.executeUpdate("insert into employee121 values(666,'shiva',100000)"); // step 4
			
			if(i>0)
			{
			System.out.println("enter data is saved");
			}
			else
				System.out.println("data not inserted");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			try {
				stmt.close();
				con.close(); // step 5
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
