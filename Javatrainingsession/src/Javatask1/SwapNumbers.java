package Javatask1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int c=0;
		System.out.println("The Value of A is " +a+ " and B is " +b+ " before swap" );
		c=a;//c=10
		a=b;//a=20
		b=c;//b=10
		System.out.println("The Value of A is " +a+ " and B is " +b+ " after swap");
	}

}
