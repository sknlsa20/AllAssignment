
public class LocalInnerEx {
	
	
	public void factorial()
	{
		class LocalClass{
			
			public void fact(int n)
			{ int fac=1;
				for(int i=1;i<=n;i++)
				{
				fac=fac*i;				
				}
				System.out.println(fac);
			}
		}
		
		LocalClass lc =new LocalClass();
		lc.fact(5);
	}
	
	
	public static void main(String[] args) {
		LocalInnerEx le=new LocalInnerEx();
		le.factorial();
	}

}
