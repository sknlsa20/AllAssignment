
public class ThisEx {
	
	int a =10;
	
	public void run()
	{
		System.out.println("run raja run");
	}
	
	public void display()
	{
		int a=89;
		System.out.println(a);
		System.out.println(this.a);
		this.run();
	}

	public static void main(String[] args) {
		
		ThisEx te = new ThisEx();
		int a=78;
		System.out.println(a);
		System.out.println(te.a);
		
		te.display();

	}

}
