package Java.langex;
import java.util.Scanner;
public class CLAEx {

	public static void main(String[] args) {
		int number1,number2;
		if(args.length!=0)
		{
			number1=Integer.parseInt(args[0]); //unboxing 
			number2=Integer.parseInt(args[1]);	//unboxing
			
		}
		else
		{
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("enter a value :");
		number1=sc.nextInt();		
		System.out.println("enter a value :");
		number2=sc.nextInt();		
		}
		
		int result =number1 + number2;
		
		Integer res=(Integer)result;// autoboxing
		
		System.out.println(res.SIZE);
		
		
		
		
		
	}

}
