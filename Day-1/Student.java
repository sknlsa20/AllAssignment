class Student
{
	int rollno; // instance variable
	String name; // instance
	int age; // instance
	long mobile; // instance
	String address; //instance
	static String course; //static or class
	static String classduration; // static or class

	static final String companyname="techsmart";


	public static void main(String arg[])
	{
		Student raja = new Student();// this is way of creating an object
		String trainername ="shiva";// local variable
		System.out.println(raja.rollno);
		System.out.println(course);
		System.out.println(trainername);
	}
}


