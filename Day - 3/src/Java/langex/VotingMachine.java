package Java.langex;
import java.util.Scanner;
public class VotingMachine {

	public static void main(String[] args) throws InValidAgeException {


		Scanner name = new Scanner(System.in);
		
		System.out.println("enter age of voter:");
		int age = name.nextInt();
		
		if(age<18)
		{
			throw new InValidAgeException("age is less to vote");
		}
		else
		{
			System.out.println("you can vote");
		}

	}

}
