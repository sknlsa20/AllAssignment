/* write a program to accept a number from user and print its table till accept number
	it should skip 2 multiples
	it should terminate at number
 */
import java.util.Scanner;
class UseCase5
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int number=sc.nextInt();

		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			else if(i==number)
			{
				break;
			}
			else
			{		

				System.out.println(number+" X "+i+" = "+(number*i));
			}
		}
	}
}