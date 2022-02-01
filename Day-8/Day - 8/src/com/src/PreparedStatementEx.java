package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class PreparedStatementEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter employee name :");
		String name = sc.next();
		
		System.out.println("enter employee id ");
		int id = sc.nextInt();
		
		System.out.println("enter employee salary ");
		double sal=sc.nextDouble();
		
		Connection con=null; //java.sql
		PreparedStatement stmt=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // step 1			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivadb","root","root"); // step 2			
			stmt= con.prepareStatement("insert into employee121 values(?,?,?)"); // step 3
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3, sal);
			
			int i=stmt.executeUpdate();
			//int i=stmt.executeUpdate("insert into employee121 values("+id+",'"+name+"',"+sal+")"); // step 4
			
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
