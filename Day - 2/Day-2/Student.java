class Student
{

int stdid;
String stdname;
int stdage;
String stdemailid;
long stdmobileno;
int m1marks, m2marks, m3marks;
int total;
double average;
char grade;
static int noofstudents;
final static int totalnumberofsubjects=3;



	public void display() // type 1
	{

		System.out.println(stdid+" "+stdname+" "+stdage+" "+stdemailid+" "+stdmobileno+" "+m1marks+" "+m2marks+" " +m3marks+" "+total+" "+average+" "+grade);

	}


	public int totalObtainMarks() // type 3
	{
		total = m1marks + m2marks + m3marks;
		return total;
	}


	public double displayAverage(int sum)// type 4
	{
		average= (double)sum/(double)totalnumberofsubjects;
		return average;
	}



	public void findGrade(double avg)// type 2
	{
		if(avg >=75)
		{
			grade='A';
			
		}
		else if(avg>=65 && avg<75)
		{
			grade='B';
		}
		else if(avg>=45 && avg<65)
		{
			grade='C';
		}

		else if(avg>=35 && avg<45)
		{
			grade='D';
		}
		else
		{
			grade='F';
		}
		System.out.println("grade of student is "+grade);

	}

	public static void updateNoofStudents()
	{
		noofstudents++;

	}
}