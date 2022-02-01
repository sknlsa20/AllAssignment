import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class UseCase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {23,45,67};
		
		Consumer c = (t)->{
			if((Integer)t%2==0)
			{
				System.out.println(t+" is even number");
			}
			else
			{
				System.out.println(t+" is odd number");
			}
		};
		
		for(int m: a)
		{			
			c.accept(m);
		}
		
		
		
		BiConsumer bi = (x,y)->{
			
			
			if((Integer)x>(Integer)y)
			{
				System.out.println(x+ "is greater");
			}
			else
			{
				System.out.println(y+" is greater");
			}
		};
		
		bi.accept(23, 56);		
		
		BiFunction bf=(x,y)->(Integer)x+(Integer)y;
		
		Integer addition = (Integer) bf.apply(45, 67);
		System.out.println(addition);
		
		
	}

}
