package com.model;

public class Student implements Comparable{
	
	private int stdid;
	private String stdname;
	private int stdage;
	
	@Override
	public int hashCode() {
		
		return stdid;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return stdid == s.stdid && stdname.equals(s.stdname) && stdage==s.stdage;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdage=" + stdage + "]";
	}
	public Student() {
		
	}
	public Student(int stdid, String stdname, int stdage) {
		
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdage = stdage;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdage() {
		return stdage;
	}
	public void setStdage(int stdage) {
		this.stdage = stdage;
	}
	@Override
	public int compareTo(Object o) {

			Student s = (Student)o;
			
		return stdid>s.stdid?1:-1;
	}
	

}
