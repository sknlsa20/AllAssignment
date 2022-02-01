
public class AnanymEx {
	
	Kickable kick = new Kickable(){

		@Override
		public void kickEveryOne() {
			System.out.println("kick everone except shiva sir");
			
		}
	};
	
	public static void main(String[] args) {
		
		AnanymEx ae=new AnanymEx();
		ae.kick.kickEveryOne();
		
		System.out.println(ae.kick.getClass());
		
	}
		


}
