
public class GreetingMain {

	public static void main(String[] args) {
		
		Greeting h =new Greeting() {

			@Override
			public void mrng() {
				System.out.println("shubprabhath");			
			}

			@Override
			public void afrnoon() {
				System.out.println("shubdopahar");				
			}

			@Override
			public void eve() {
				System.out.println("shubsadhya");				
			}

			@Override
			public void ngt() {
				System.out.println("shubratri");
				
			}			
		};
		
		h.mrng();
		h.afrnoon();
		h.eve();
		h.ngt();
		
		h = new Greeting() {

			@Override
			public void mrng() {
				System.out.println("good morning");
				
			}

			@Override
			public void afrnoon() {
				System.out.println("good afternoon");
				
			}

			@Override
			public void eve() {
				System.out.println("good evening");
				
			}

			@Override
			public void ngt() {
				System.out.println("good night");
				
			}
			
		};
		
		h.mrng();
		h.afrnoon();
		h.eve();
		h.ngt();

	}

}
