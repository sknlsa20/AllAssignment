package day4;

public class ThreadAssignMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadAssign t1= new ThreadAssign(); //thread object
		MyThread t2 = new MyThread();
		
		
		MyClass r1= new MyClass();//normal object
		Thread t3= new Thread(r1); //thread object
		t1.start();
		t2.start();
		t3.start();
	

	}

}
