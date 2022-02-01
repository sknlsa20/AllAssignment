/* accept n number of students and get there values and display them */
import java.util.Scanner;
class UseCase7
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of students to be accepted : ");
		int size = sc.nextInt();

		Student s[] = new Student[size]; // array object
		
		for(int i=0;i<size;i++)
		{

		s[i] = new Student();// creating an object	
		System.out.println("enter student id :");
		s[i].stdid=sc.nextInt();
		System.out.println("enter student name :");
		s[i].stdname=sc.next();
		System.out.println("enter student age :");
		s[i].stdage=sc.nextInt();
		System.out.println("enter student email id :");
		s[i].stdemailid=sc.next();
		System.out.println("enter student mobile:");
		s[i].stdmobileno=sc.nextLong();
		System.out.println("enter student m1,m2 and m3 marks :");
		s[i].m1marks=sc.nextInt();
		s[i].m2marks=sc.nextInt();
		s[i].m3marks=sc.nextInt();

		Student.updateNoofStudents();
		int sum=s[i].totalObtainMarks();
		double avrg = s[i].displayAverage(sum);
		s[i].findGrade(avrg);	
		}

		for(int i=0;i<size;i++)
		{
			s[i].display();
		}

		System.out.println(Student.noofstudents);
		

		
	}

}

