package com.src.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharEx {

	public static void main(String[] args) throws IOException {

		FileWriter writer =new FileWriter("written.txt");
		
		String str ="this is my life";
		
		writer.write(str);
		
		System.out.println("data inserted into file");
		
		writer.close();
		
		FileReader reader = new FileReader("written.txt");
		
		int i=0;
		
		while((i=reader.read())!=-1)
		{
			System.out.print((char)i);
		}

	}

}
