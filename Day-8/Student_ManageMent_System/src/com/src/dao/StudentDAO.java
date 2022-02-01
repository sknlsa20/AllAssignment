package com.src.dao;

import java.util.ArrayList;

import com.src.model.Student;

public interface StudentDAO {
	
	
	
	public int insert(Student s);
	public int edit(Student s);
	public int delete(Student s);
	public ArrayList<Student> getStudents();
	
	

}
