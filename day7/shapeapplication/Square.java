package day7.shapeapplication;

public class Square extends Shape
{
	double side;
	
	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;
	}
	
	public double getArea()
	{
		return Math.pow(side, 2);
	}
	
	public double getPerimeter()
	{
		return 4*side;
	}
}
