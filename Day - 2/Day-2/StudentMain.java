import java.util.Scanner;
class StudentMain
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		
		Student s1 = new Student();// creating an object	
		s1.display();// default values

		System.out.println("enter student id :");
		s1.stdid=sc.nextInt();
		System.out.println("enter student name :");
		s1.stdname=sc.next();
		System.out.println("enter student age :");
		s1.stdage=sc.nextInt();
		System.out.println("enter student email id :");
		s1.stdemailid=sc.next();

		System.out.println("enter student mobile:");
		s1.stdmobileno=sc.nextLong();
		System.out.println("enter student m1,m2 and m3 marks :");
		s1.m1marks=sc.nextInt();
		s1.m2marks=sc.nextInt();
		s1.m3marks=sc.nextInt();
		Student.updateNoofStudents();

		int sum=s1.totalObtainMarks();
		double avrg = s1.displayAverage(sum);
		s1.findGrade(avrg);

		Student s2 = new Student();// creating an object	
		s2.display();// default values

		System.out.println("enter student id :");
		s2.stdid=sc.nextInt();
		System.out.println("enter student name :");
		s2.stdname=sc.next();
		System.out.println("enter student age :");
		s2.stdage=sc.nextInt();
		System.out.println("enter student email id :");
		s2.stdemailid=sc.next();

		System.out.println("enter student mobile:");
		s2.stdmobileno=sc.nextLong();
		System.out.println("enter student m1,m2 and m3 marks :");
		s2.m1marks=sc.nextInt();
		s2.m2marks=sc.nextInt();
		s2.m3marks=sc.nextInt();
		Student.updateNoofStudents();

		sum=s2.totalObtainMarks();
		avrg = s2.displayAverage(sum);
		s2.findGrade(avrg);
		System.out.println(Student.noofstudents);
		s1.display();
		s2.display();
		

		
	}
}