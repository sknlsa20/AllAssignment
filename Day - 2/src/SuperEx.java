
public class SuperEx {
int a=90;
	
}

class SubEx extends SuperEx{
	
	int a=78;
	
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		SubEx se=new SubEx();
		se.display();
	}
}
