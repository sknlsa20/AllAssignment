package com.src.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PipedOutputStream pos =new PipedOutputStream();
		PipedInputStream pis = new PipedInputStream();
		
		pos.connect(pis);
		
		Thread t1 = new Thread(()->{
			for(int i=65;i<=90;i++)
			{
				try {
					pos.write(i);
					Thread.sleep(1000);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=65;i<=90;i++)
			{
				try {
					System.out.println((char)pis.read());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();

	}

}
