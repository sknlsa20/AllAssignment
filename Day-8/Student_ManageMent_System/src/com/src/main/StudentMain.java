package com.src.main;
import java.util.ArrayList;
import java.util.Scanner;

import com.src.dao.StudentDAO;
import com.src.dao.StudentDAOImpl;
import com.src.model.Student;
public class StudentMain {

	public static void main(String[] args) {

		Scanner name = new Scanner(System.in);
		int choice=0;
		int id;
		String sname;
		String sadd;
		int sage;
		long smob;
		
		StudentDAOImpl sdao=new StudentDAOImpl();
		sdao.getMyConnection();
		
		System.out.println("**********Welcome to STUDENT MANAGEMENT SYSTEM ****************");
		do {
		System.out.println("Choose from following options : ");
		System.out.println("1. Add Student");
		System.out.println("2. Delete Student");
		System.out.println("3. Update Student");
		System.out.println("4. Display Students");
		System.out.println("5. Exit");
		choice=name.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println("Enter student Id ");
				id=name.nextInt(); 
				System.out.println("enter student Name :");
				sname=name.next();
				System.out.println("enter student address :");
				sadd=name.next();
				System.out.println("enter student age :");
				sage = name.nextInt();
				System.out.println("enter student mobile number :");
				smob=name.nextLong();				
				Student s = new Student(id,sname,sadd,sage,smob);	
				
				int i =sdao.insert(s);	
				if(i>0) {
					
					System.out.println("inserted student");
				}
				else
				{
					System.out.println("student was not inserted");
				}
				
				break;
				
			}
			case 2:
			{
				System.out.println("Enter student Id ");
				id=name.nextInt(); 
				Student s = new Student(id);				
				
				int i =sdao.delete(s);	
				if(i>0) {
					
					System.out.println("deleted student");
				}
				else
				{
					System.out.println("student was not deleted");
				}
				break;
			}
			case 3:
			{
				System.out.println("Enter student Id ");
				id=name.nextInt(); 
				System.out.println("enter student Name :");
				sname=name.next();
				System.out.println("enter student address :");
				sadd=name.next();
				System.out.println("enter student age :");
				sage = name.nextInt();
				System.out.println("enter student mobile number :");
				smob=name.nextLong();				
				Student s = new Student(id,sname,sadd,sage,smob);	
				
				int i =sdao.edit(s);
				if(i>0) {
					
					System.out.println("updated student");
				}
				else
				{
					System.out.println("No student with id");
				}
				
				break;
			}
			case 4:
			{
				ArrayList<Student> al =sdao.getStudents();
				for(Student s:al)
				{
					System.out.println(s);
				}
				break;
			}
			case 5:
			{
				System.out.println("good bye");
				sdao.closeConnection();
				break;
			}
			default:
			{
				System.out.println("invalid choice");
				break;
			}
		}
		
		}while(choice!=5);
		
		

	}

}
