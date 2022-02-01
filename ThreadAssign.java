package day4;

public class ThreadAssign extends Thread {
	
	public void run()
		{	for(int i=1;i<5;i++)
			System.out.println("Java is Hot");

	}
}

class MyThread extends Thread{

	
	public void run()
	{	for(int i=1;i<5;i++)
		System.out.println("java is invigorating");
	}
	
}

class MyClass  implements Runnable{
	
		public void run()
		{
			for(int i=1;i<5;i++)
				System.out.println("Java is aromatic");
		
		}
	

	}

