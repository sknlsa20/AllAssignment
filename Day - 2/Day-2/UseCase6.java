/* accept n number of values and find out sum of all numbers */

import java.util.Scanner;
class UseCase6
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of values to be accepted : ");
		int size = sc.nextInt();
		int sum=0;

		int ar[]=new int[size];
		for(int i=0;i<size;i++)
		{
			ar[i]= sc.nextInt();
		}


		for(int i=0;i<size;i++)
		{
			sum+=ar[i];
			System.out.println(" "+ar[i]);
		}

		System.out.println(sum);

		
	}

}