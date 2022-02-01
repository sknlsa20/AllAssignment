/* write a program to find out given number is divisible by 2 , 3 and 5 */

class UseCase1
{
	public static void main(String arg[])
	{
		int n=90;

		if(n%2==0)
		{
			System.out.println(n+" is divisible by 2");
			if(n%3==0)
			{
				System.out.println(n+" is divisible by 3");
			}
			else if(n%5==0)
			{
				System.out.println(n+" is divisible by 5");
			}
			else
			{
				System.out.println(n+" is divisible by 2 but not by 3 and 5");
			}
		}
		else if(n%3==0)
		{
			System.out.println(n+" is divisible by 3");
		}
		else if(n%5==0)
		{
			System.out.println(n+" is divisible by 5");
		}
		else
		{
			System.out.println(n+" is not divisible by 2,3 and 5");
		}

		System.out.println("end of program");
	}
}