
public class CarMain {

	public static void main(String[] args) {
		
		MaruthiCar mc=new MaruthiCar();
		mc.applyBreak();
		mc.changeCluth();
		mc.giveAccelarator();
		
		
		Car bmwcar = new Car() {
			@Override
			public void applyBreak() {
				System.out.println("applied breaks in bmw");
				
			}

			@Override
			public void giveAccelarator() {
				System.out.println("applying accelaration");
				
			}

			@Override
			public void changeCluth() {
				System.out.println("changing bmw");
				
			}			
		};
		
			bmwcar.applyBreak();
			bmwcar.changeCluth();
			bmwcar.giveAccelarator();

	}

}
