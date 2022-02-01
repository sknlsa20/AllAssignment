/* accept a number and find out sum of  n numbers*/
import java.util.Scanner;
class UseCase3
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a value :");
		int number = sc.nextInt();

		int sum=0;
		int i=0;
		while(i<=number)
		{
			sum+=i;
			i++;
		}

		System.out.println(sum);
	}
}