
public class OuterClass {
	
	static int variable=45;
	
	static class InnerClass{		
		
		void run()
		{
			System.out.println("run raja run");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(variable);
		
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		
		ic.run();
	}

}
