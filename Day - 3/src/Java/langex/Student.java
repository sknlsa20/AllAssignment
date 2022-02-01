package Java.langex;

public class Student {
	
	int stdid;
	String stdname;
	String stdaddress;
	
	@Override
	public int hashCode() {
		
		return stdid;
	}

	@Override
	public boolean equals(Object obj) {
		
		Student s=(Student)obj;
		
		return this.stdid==s.stdid && this.stdname.equals(s.stdname) && this.stdaddress.equals(s.stdaddress);
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdaddress=" + stdaddress + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {		
		Student s=new Student();		
		s.stdid=stdid;
		s.stdname=stdname;
		s.stdaddress=stdaddress;
		return s;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("my object is getting free");
	}
	
	
	

	
	
	
	
	
	
	
	
	
	

}
