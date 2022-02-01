/* 
write a program to display all arithmetic operations , use menu card
	1. addition
	2. subtraction
	3. multiplication
	4. division
	5. modular
	6. exit

*/
import java.util.Scanner;
class UseCase4
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;	
		do{	

		System.out.println("choose from following options : \n1. addition\n2. subtraction\n3. multiplication \n4. division \n5. modular\n6. exit");
		choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				{
					System.out.println("enter numbers to be added");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println("addition ="+(num1+num2));
					break;
				}
			case 2:
				{
					System.out.println("enter numbers to be subtract");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println("subtraction ="+(num1-num2));
					break;
				}
			case 3:
				{
					System.out.println("enter numbers to be multiplication");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println("multiplication ="+(num1*num2));
					break;
				}
			case 4:
				{
					System.out.println("enter numbers to be division");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println("division ="+((double)num1/(double)num2));
					break;
				}
			case 5:
				{
					System.out.println("enter numbers to be modular");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println("modular ="+(num1%num2));
					break;
				}

			case 6:
				{
					break;
				}

			default:
				{
					System.out.println("invalid entry");
				}
		}

		}while(choice!=6);
		
	}
}