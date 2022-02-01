package com.src.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileStreamEx {

	public static void main(String[] args) throws IOException {
		
		Scanner name = new Scanner(System.in);
		System.out.println("enter student name :");
		String sname = name.next();
		
		FileOutputStream fos =new FileOutputStream("sample.txt");
		
		byte b[]=sname.getBytes();
		
		fos.write(b);
		
		System.out.println("data entered into file");
		
		
		FileInputStream fis = new FileInputStream("sample.txt");
		
		int i =0;
		
		while((i=fis.read())!=-1)
		{
			
			System.out.print((char)i);
		}
	}

}
