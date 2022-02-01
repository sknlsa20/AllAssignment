package Java.langex;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExceptionEx {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner name = new Scanner(System.in);
		FileInputStream fis=new FileInputStream("sample.txt");// checked exception
		System.out.println("enter two values :");
		
		int a = name.nextInt();
		int b = name.nextInt();
		
		try {
		double result = a/b; // unchecked exception
		System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
			System.out.println("should be executed.");
		}
		System.out.println("end of program");
		
		

	}

}
