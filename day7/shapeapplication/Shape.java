package day7.shapeapplication;

// Abstraction: Hiding complex implementation details and show only essential features
//				of the object. Cannot create object from abstract class but still able
//				to inherit the attributes and methods.

public abstract class Shape
{
	String colour;

	public Shape(String colour)
	{
		this.colour = colour;
	}
}
