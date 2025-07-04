package Javatask2;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String reverse=reverseString(str);
		System.out.println(reverse);
	}
	private static String reverseString(String input)
	{
		int len=input.length();
		StringBuffer sb=new StringBuffer();
		for(int i=(len-1);i>=0;i--)
		{
			sb.append(input.charAt(i)).toString();
			
			
		}
		return sb.toString() ;
		

	}
}



