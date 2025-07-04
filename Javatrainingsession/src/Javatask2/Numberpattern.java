package Javatask2;

import java.util.Scanner;

public class Numberpattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int counter=0;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
			counter++;
			System.out.print(counter);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
