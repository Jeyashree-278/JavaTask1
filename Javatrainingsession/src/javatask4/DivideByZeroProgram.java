package javatask4;

import java.util.Scanner;

public class DivideByZeroProgram {

	public static void main(String[] args) {
		
		division();
		
	}
	
	public static void division()
	{
		try {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		int div=num1/num2;
		System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input, enter only numeric value");
		}
		
	}

}
