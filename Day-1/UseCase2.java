/* accept a character from user and check it is vowel or not*/


import java.util.Scanner;

class UseCase2
{
	public static void main(String shiva[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a character value :");
		char c =sc.next().charAt(0);

		switch(c)
		{
			case 'a':
				{
					System.out.println(c+" is a vowel");
					break;
				}
			case 'e':
				{
					System.out.println(c+" is a vowel");
					break;
				}

			case 'i':
				{
					System.out.println(c+" is a vowel");
					break;
				}
			case 'o':
				{
					System.out.println(c+" is a vowel");
					break;
				}
			case 'u':
				{
					System.out.println(c+" is a vowel");
					break;
				}
			default:
				{
					System.out.println(c+" is a not a vowel");
				}
		}
	}
}