
public class OverriddingEx extends OverloadingEx{
	
	@Override
	public int add(int x,int y)
	{
		return x+y;
	}
	
	public static void main(String[] args) {
		OverriddingEx oe =new OverriddingEx();
		
		oe.add(56, 34);
	}

}
