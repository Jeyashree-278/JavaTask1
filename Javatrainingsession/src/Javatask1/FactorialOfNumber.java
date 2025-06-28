package Javatask1;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args)
	
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the factorial of a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("The factorial of a given number is "+fact);
				
	}

}
