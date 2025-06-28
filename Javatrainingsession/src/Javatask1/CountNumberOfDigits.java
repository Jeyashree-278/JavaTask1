package Javatask1;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int number=sc.nextInt();
		int count=0;
		while(number!=0)
		{
			number/=10;
			++count;
		}
		System.out.println("The number of digits is " +count);
		// TODO Auto-generated method stub

	}

}
