package com.src.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Student st = new Student(234,"sk","hyd");
		Student st1 = new Student(678,"kk","sec");
		
		FileOutputStream fos =new FileOutputStream("student.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(st);
		oos.writeObject(st1);
		
		System.out.println("student objects written to file");
		
		FileInputStream fis =new FileInputStream("student.txt");
		
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		Student s=null;
		while((s=(Student) ois.readObject())!=null)
		{
			System.out.println(s);
		}
		
		

	}

}
