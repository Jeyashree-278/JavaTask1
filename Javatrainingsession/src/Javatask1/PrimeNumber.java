package Javatask1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n<=1)
		{
			System.out.println("Its a prime number");
		}
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Its a prime number");
				break;
			}
			else
			{
				System.out.println("Its not a prime number");
			}
	}
		
	}
}
