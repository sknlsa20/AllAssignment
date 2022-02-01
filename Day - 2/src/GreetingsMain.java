
public class GreetingsMain {

	public static void main(String[] args) {

		Hindi h =new Hindi();
		h.mrng();
		h.afternoon();
		h.evening();
		h.ngt();
		
		English e =new English();
		
		e.mrng();
		e.afternoon();
		e.evening();
		e.ngt();
		
		System.out.println("-------------------------------------");
		Greeting g = new Hindi(); // dynamic binding
		
		g.mrng();
		g.afternoon();
		g.evening();
		g.ngt();
		System.out.println(Greeting.va);
	}

}
