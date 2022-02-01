
public class Employee {
	
	private int empid;
	private String empname;
	private String empaddress;
	
	Employee(){
		empid=0;
		empname=null;
		empaddress=null;
		
	}
	
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	
	public void display()
	{
		System.out.println(empid+" - "+empname+" - "+empaddress);
	}
	
	
	
	
	

}
