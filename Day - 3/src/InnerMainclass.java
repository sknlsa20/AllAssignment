
public class InnerMainclass {

	public static void main(String[] args) {
		
		System.out.println(OuterClass.variable);
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.run();
		
		
		
		
		NonStaticInnerClassMemeberEx ne = new NonStaticInnerClassMemeberEx();		
		NonStaticInnerClassMemeberEx.InnerClassMember icm = ne.new InnerClassMember();		
		icm.display();
		
	}

}
