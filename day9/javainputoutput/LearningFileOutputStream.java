package day9.javainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningFileOutputStream
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileOutputStream output = new FileOutputStream("test.dat");
			
			for(int i=10 ; i<=50 ; i++)
			{
				output.write(i);		// Writing data inside test.dat file
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
