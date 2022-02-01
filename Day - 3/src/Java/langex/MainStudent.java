package Java.langex;

public class MainStudent {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {


		Student s = new Student();
		s.stdid=420;
		s.stdname="kumar";
		s.stdaddress="hyd";
		Student s1 = new Student();
		s1.stdid=420;
		s1.stdname="kumar";
		s1.stdaddress="sec";
		System.out.println(s.getClass());		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());		
		System.out.println(s.equals(s1));
		
		System.out.println(s); // toString();
		
		
		Student s2=s1;// shallow copy
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1.stdid=678;
		
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3 = (Student) s1.clone();//full copy
		
		System.out.println(s1);
		System.out.println(s3);
		s1.stdid=90;
		
		System.out.println(s1);
		System.out.println(s3);
		
		s1=null;
		System.gc();
		
		System.out.println("end of program");
		
		
	}

}
