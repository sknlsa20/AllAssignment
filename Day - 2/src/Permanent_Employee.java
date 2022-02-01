
public class Permanent_Employee extends Employee{
	
	private double empsalary;
	private int workingdays;
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public int getWorkingdays() {
		return workingdays;
	}
	public void setWorkingdays(int workingdays) {
		this.workingdays = workingdays;
	}
	
	public void display()
	{
	
		System.out.println(getEmpid()+" - "+getEmpname()+" - "+getEmpaddress()+" - "+empsalary+" - "+workingdays);
	}
	
	

}
