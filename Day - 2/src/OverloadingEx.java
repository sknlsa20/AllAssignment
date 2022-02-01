
public class OverloadingEx {

	public static void main(String[] args) {
		
		OverloadingEx oe=new OverloadingEx();
		System.out.println(oe.add(45,67));
		System.out.println(oe.add(45.7,67.9));
		System.out.println(oe.add(45,67,78));
		

	}
	
	public int add(int x,int y) // type 4
	{
		return x+y;
	}
	
	public double add(double i, double j)
	{
		return i+j;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}

}
