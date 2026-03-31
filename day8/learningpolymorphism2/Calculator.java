package day8.learningpolymorphism2;

/*	Method overloading = 	Occurs when multiple methods in the same class have the 
 * 							same name but different parameters.
 */

public class Calculator
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
}
