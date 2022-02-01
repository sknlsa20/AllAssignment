
public class Customer {
	private int custid;
	private String custorder;
	private long custmobileno;
	private String custaddress;
	
	
	Customer(){
		custid=90;
		custorder="toy car";
		custmobileno=898989;
		custaddress="sec";
		
	}
	
	Customer(int custid)
	{
		this.custid=custid;
	}
	Customer(int custid,String custorder)
	{
		this(custid);
		this.custorder=custorder;
	}
	
	Customer(int custid,String custorder,long custmobileno,String custaddress)
	{
		
		this(custid,custorder);
		this.custmobileno=custmobileno;
		this.custaddress=custaddress;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustorder() {
		return custorder;
	}
	public void setCustorder(String custorder) {
		this.custorder = custorder;
	}
	public long getCustmobileno() {
		return custmobileno;
	}
	public void setCustmobileno(long custmobileno) {
		this.custmobileno = custmobileno;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	
	
}
