
public class LamdaEx {

	public static void main(String[] args) {
		
		ArithmeticEx ae = new ArithmeticEx() {
			@Override
			public void display(Object x, Object y) {
				System.out.println("addition ="+((Integer)x+(Integer)y));				
			}			
		}; 
		
		ae.display(23, 45);
		
		ae =new ArithmeticEx() {
			@Override
			public void display(Object x, Object y) {
				System.out.println("subtraction ="+((Integer)x+(Integer)y));				
			}			
		};
		ae.display(23, 45);
		
		ArithmeticEx ae1 = (x,y)->System.out.println("multiplication ="+((Double)x*(Double)y));				
		
		ae1.display(2.4, 3.5);
		
		ArithmeticEx ae2=(x,y)->System.out.println("division ="+((Integer)x/(Integer)y));	
		
		ae2.display(4, 2);		

	}

}
