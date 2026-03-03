package day6.computerapplication;

public class Laptop extends Portable		// Laptop inherit from Portable
{
	String graphicCard;
	boolean sleeping;
	
	public Laptop(String operatingSystem, String graphicCard)
	{
		super(operatingSystem);
		this.graphicCard = graphicCard;		// Storing data from parameter to instance
		sleep();				// Sleep mode on whenever laptop object is created
	}
	
	public void sleep()
	{
		sleeping = true;		// Sleep mode is on
	}
	
	public void wakeUp()
	{
		sleeping = false;		// Sleep mode is off
	}
}
