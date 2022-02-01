
public class ShapeMain {

	public static void main(String[] args) {
		
		Triangle t = new Triangle(); //static binding object
		
		t.draw();
		
		Square s =new Square(); // static binding object
		s.draw();
		
		Shape sh = new Triangle(); // dynamic binding is possible only inheritance
		
		sh.draw();// triangle
		sh = new Square();
		sh.draw();//square

	}

}
