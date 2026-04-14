package day9.learningthreads;

public class Message implements Runnable
{
	// Threads allow you to run lines of codes simultaneously
	
	String name;		// Instance variable
	
	public Message(String name)		// Constructor for Message
	{
		this.name = name;
	}

	@Override
	public void run()
	{
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i + ". " + name);
			
			try
			{
				Thread.sleep(1000);		// Delay for 1 sec / 1000ms
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
