package com.src.io;

import java.io.Serializable;

public class Student implements Serializable{
	
	int stdid;
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", Stdaddress=" + Stdaddress + "]";
	}
	String stdname;
	String Stdaddress;
	public Student(int stdid, String stdname, String stdaddress) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		Stdaddress = stdaddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
