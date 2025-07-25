package javatask4;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}
public class InvalidAgeExceptionProgram 
{

	public static void main(String[] args) {
		
		try {
			InvalidAge();
		} catch (InvalidAgeException e) {
			
			e.getMessage();
		}

	}

	public static void InvalidAge() throws InvalidAgeException 
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Age");
			int age=sc.nextInt();
			if(age<18)
			{
				throw new InvalidAgeException("please enter age greater than 18, Invalid age");
			}
			else
			{
				System.out.println(age);
			}
			
		
	}
}
