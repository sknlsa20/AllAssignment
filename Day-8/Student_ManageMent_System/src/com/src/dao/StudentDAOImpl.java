package com.src.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.src.model.Student;

public class StudentDAOImpl implements StudentDAO {

	Connection con;
	PreparedStatement stmt;
	public Connection getMyConnection()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // step 1			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivadb","root","root"); // step 2			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
		return con;	
	}
	
	public void closeConnection()
	{
		try {
			con.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public int insert(Student s) {
		int i=0;
		try {
			stmt=con.prepareStatement("insert into student values(?,?,?,?,?)");	
			
			stmt.setInt(1, s.getStdid());
			stmt.setString(2, s.getStdname());
			stmt.setString(3,s.getStdaddress());
			stmt.setInt(4, s.getStdage());
			stmt.setLong(5, s.getStdmobileno());
			
			i =stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return i;
	}

	@Override
	public int edit(Student s) {
		int i=0;
		try {
			stmt=con.prepareStatement("update student set stdname=?,stdaddress=?,stdage=?,stdmobileno=? where stdid=?");	
			
			
			stmt.setString(1, s.getStdname());
			stmt.setString(2,s.getStdaddress());
			stmt.setInt(3, s.getStdage());
			stmt.setLong(4, s.getStdmobileno());
			stmt.setInt(5, s.getStdid());
			
			i =stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return i;
	}

	@Override
	public int delete(Student s) {
		int i=0;
		try {
			stmt=con.prepareStatement("delete from student where stdid=?");		
			
			stmt.setInt(1, s.getStdid());
			
			i =stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return i;
	}

	@Override
	public ArrayList<Student> getStudents() {
		
		ResultSet rs=null;
		ArrayList<Student> al =new ArrayList();
		
		
		try {
			stmt=con.prepareStatement("select * from student");				
			rs =stmt.executeQuery();
			
			while(rs.next())
			{
				Student s = new Student();
				s.setStdid(rs.getInt(1));
				s.setStdname(rs.getString(2));
				s.setStdaddress(rs.getString(3));
				s.setStdage(rs.getInt(4));
				s.setStdmobileno(rs.getLong(5));
					
				al.add(s);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return al;
		

	}

}
