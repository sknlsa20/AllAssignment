
public class Shape {

	
	public void draw()
	{
		System.out.println("draw a shape");
	}
	
	Shape(){
		System.out.println("this is shape constructor");
	}
}

class Triangle extends Shape{
	@Override
	public void draw()
	{
		System.out.println("draw a triangle");
	}
	
	Triangle()
	{
		System.out.println("this is triangle constructor");
	}
}

class Square extends Shape{
	
	@Override
	public void draw()
	{
		System.out.println("draw a square");
	}
	
	Square()
	{
		System.out.println("this is square constructor");
	}
}
