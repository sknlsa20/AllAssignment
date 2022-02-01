
public class CustomerMain {

	public static void main(String[] args) {
		Customer c =new Customer();
		
		System.out.println(c.getCustid()+" "+c.getCustorder()+" "+c.getCustmobileno()+" "+c.getCustaddress());
		
		
		Customer c1 =new Customer(45,"cycle",777777,"hyd");
		System.out.println(c1.getCustid()+" "+c1.getCustorder()+" "+c1.getCustmobileno()+" "+c1.getCustaddress());
	
		Customer c2 = new Customer(78);
		System.out.println(c2.getCustid()+" "+c2.getCustorder()+" "+c2.getCustmobileno()+" "+c2.getCustaddress());
		
	}

}
