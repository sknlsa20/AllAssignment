package com.src.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {

	public static void main(String[] args) throws IOException {

		int a =89;
		char c ='e';
		float f = 7.8f;
		
		FileOutputStream fos =new FileOutputStream("data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(a);
		dos.writeChar(c);
		dos.writeFloat(f);
		
		System.out.println("data written to file");
		
		
		FileInputStream fis =new FileInputStream("data.txt");
		
		DataInputStream dis =new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());

	}

}
