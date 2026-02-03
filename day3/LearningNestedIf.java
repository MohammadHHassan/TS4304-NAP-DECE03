package day3;

import java.util.Scanner;

public class LearningNestedIf
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = scanner.nextInt();
		
		if(age>=0)
		{
			System.out.println("Valid age.");
			
			if(age<12)
			{
				System.out.println("No IC yet.");
			}
			else if(age>=12 && age<18)
			{
				System.out.println("Has IC. Not eligible to drive.");
			}
			else
			{
				System.out.println("Has IC. Eligible to drive.");
			}
		}
		else
		{
			System.out.println("Invalid age.");
		}
		
		scanner.close();
	}
}
