package Javatask1;

import java.util.Scanner;

public class FindSeniorCitizen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of a person");
		int age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("The person is a senior citizen");
			
		}
		else
		{
			System.out.println("The person is not a senior citizen");
			
		}
	}

}
