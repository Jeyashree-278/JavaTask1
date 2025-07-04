package Javatask2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine().toUpperCase();
		String reversestr= reverseString(str);
		if(reversestr.equals(str))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}
		
		private static String reverseString(String str)
		{
			StringBuffer sb=new StringBuffer();
			sb.append(str);
			return sb.reverse().toString();
			
		}
	}


